package kg.gov.mf.loan.manage.dao.order;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Repository("creditOrderDao")
public class CreditOrderDaoImpl extends GenericDaoImpl<CreditOrder> implements CreditOrderDao{

    @Override
    public CreditOrder getById(Long id){
        CreditOrder result = super.getById(id);
        Hibernate.initialize(result.getAppliedEntityLists());
        Hibernate.initialize(result.getOrderDocumentPackages());
        Hibernate.initialize(result.getOrderTerms());
        Hibernate.initialize(result.getCreditOrderType());
        Hibernate.initialize(result.getCreditOrderState());
        return result;
    }

}
