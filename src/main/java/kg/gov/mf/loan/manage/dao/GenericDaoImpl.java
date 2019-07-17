package kg.gov.mf.loan.manage.dao;

import kg.gov.mf.loan.manage.model.collateral.*;
import kg.gov.mf.loan.manage.model.collection.*;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.entity.AppliedEntity;
import kg.gov.mf.loan.manage.model.loan.*;
import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import kg.gov.mf.loan.task.component.AuthenticationFacade;
import kg.gov.mf.loan.task.model.GenericModel;
import org.hibernate.Criteria;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.List;

@Repository
public abstract class GenericDaoImpl<E> implements GenericDao<E> {
	
	@Autowired
    protected SessionFactory sessionFactory;

    @Autowired
    protected AuthenticationFacade authenticationFacade;

    protected Class<? extends E> entityClass;

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        entityClass = (Class) pt.getActualTypeArguments()[0];
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public Long add(E entity) {
        if(isAuditable(entity)) {
            if(entity.getClass().equals(Loan.class))
            {
                ((Loan) entity).setAuCreatedDate(new Date());
                ((Loan) entity).setAuCreatedBy(authenticationFacade.getUser());
            } else {
                ((GenericModel) entity).setAuCreatedDate(new Date());
                ((GenericModel) entity).setAuCreatedBy(authenticationFacade.getUser());
            }

        }
        return (Long)getCurrentSession().save(entity);
    }

    public void update(E entity) {
        if(isAuditable(entity)) {
            if(entity.getClass().equals(Loan.class))
            {
                ((Loan) entity).setAuLastModifiedDate(new Date());
                ((Loan) entity).setAuLastModifiedBy(authenticationFacade.getUser());
            } else {
                ((GenericModel) entity).setAuLastModifiedDate(new Date());
                ((GenericModel) entity).setAuLastModifiedBy(authenticationFacade.getUser());
            }
        }

        getCurrentSession().update(entity);
    }

    public List<E> list() {
        return getCurrentSession().createCriteria(entityClass).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
    }

    public List<E> list(int firstResult, int maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    public List<E> listByParam(String param) {

        return getCurrentSession().createCriteria(entityClass).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).addOrder(Order.asc(param)).list();
    }

    public List<E> listByParam(String param, int firstResult, int maxResults) {

        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.addOrder(Order.asc(param));
        return criteria.list();
    }

    public int count() {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        ScrollableResults scrollableResults = criteria.scroll();
        scrollableResults.last();
        return  scrollableResults.getRowNumber()+1;
    }

    public E getById(Long id) {
        return getCurrentSession().get(entityClass, id);
    }

    public void remove(E entity) {
        getCurrentSession().delete(entity);
    }

    boolean isAuditable(E entity) {

        Object[] auditedClass = new Object[]
        {
                Payment.class,
                PaymentSchedule.class,
                CreditTerm.class,
                CollectionPhase.class,
                Loan.class,
                CollateralAgreement.class,
                CollateralItem.class,
                CollateralArrestFree.class,
                CollectionEvent.class,
                CollateralInspection.class,
                Debtor.class,
                AdditionalAgreement.class,
                AppliedEntity.class,
                Bankrupt.class,
                DebtTransfer.class,
                GuarantorAgreement.class,
                Judgement.class,
                WriteOff.class,
                CurrencyRate.class,
                FloatingRate.class
        };

        return Arrays.asList(auditedClass).contains(entity.getClass());
    }

}
