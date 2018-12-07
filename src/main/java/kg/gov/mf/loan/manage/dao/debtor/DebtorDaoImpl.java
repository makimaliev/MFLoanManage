package kg.gov.mf.loan.manage.dao.debtor;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Debtor;

@Repository("debtorDao")
public class DebtorDaoImpl extends GenericDaoImpl<Debtor> implements DebtorDao{

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
}
