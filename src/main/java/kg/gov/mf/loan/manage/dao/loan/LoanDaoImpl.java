package kg.gov.mf.loan.manage.dao.loan;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Repository("loanDao")
public class LoanDaoImpl extends GenericDaoImpl<Loan> implements LoanDao{

    @Override
    public Loan getById(Long id)
    {
        Loan result = super.getById(id);
        Hibernate.initialize(result.getCreditTerms());
        Hibernate.initialize(result.getWriteOffs());
        Hibernate.initialize(result.getPaymentSchedules());
        Hibernate.initialize(result.getPayments());
        Hibernate.initialize(result.getSupervisorPlans());
        Hibernate.initialize(result.getLoanGoods());
        Hibernate.initialize(result.getDebtTransfers());
        Hibernate.initialize(result.getTargetedUses());
        Hibernate.initialize(result.getReconstructedLists());
        Hibernate.initialize(result.getBankrupts());
        Hibernate.initialize(result.getCollaterals());
        Hibernate.initialize(result.getAccrues());
        Hibernate.initialize(result.getLoanSummaries());
        Hibernate.initialize(result.getLoanDetailedSummaries());
        return result;
    }
}
