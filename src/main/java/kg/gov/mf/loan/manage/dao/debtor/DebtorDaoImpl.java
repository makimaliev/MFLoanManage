package kg.gov.mf.loan.manage.dao.debtor;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Debtor;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
//        result.getLoans().size();
        //
        return result;
    }

    @Override
    public Debtor getByOwnerId(Long id) {
        String baseQuery="select * from debtor where ownerId='"+id+"'";
        Query query=entityManager.createNativeQuery(baseQuery,Debtor.class);

        return (Debtor) query.getSingleResult();
    }
}
