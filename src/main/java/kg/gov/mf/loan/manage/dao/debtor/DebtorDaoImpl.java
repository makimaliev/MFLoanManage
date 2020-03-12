package kg.gov.mf.loan.manage.dao.debtor;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository("debtorDao")
public class DebtorDaoImpl extends GenericDaoImpl<Debtor> implements DebtorDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public Debtor getById(Long id)
    {
        Debtor result = super.getById(id);
        Hibernate.initialize(result.getLoans());
        Hibernate.initialize(result.getDebtorType());
        Hibernate.initialize(result.getOrgForm());
        Hibernate.initialize(result.getWorkSector());
        Hibernate.initialize(result.getDebtorGroup());
        Hibernate.initialize(result.getDebtorSubGroup());
        Hibernate.initialize(result.getDebtorActStatus());
        Hibernate.initialize(result.getDebtorActNeeded());
//        result.getLoans().size();
        //
        return result;
    }

    @Override
    public Debtor getByOwnerId(Long id) {


        Session session = this.sessionFactory.getCurrentSession();

        Criteria criteria = session.createCriteria(Debtor.class);
        criteria.createAlias("owner", "owner");
        criteria.add(Restrictions.eq("owner.id", id));

        return (Debtor) criteria.uniqueResult();
    }
}
