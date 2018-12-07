package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.model.loan.Payment;
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

//        for (Payment payment  : result.getPayments())
//        {
//            Hibernate.initialize(payment.getPaymentType());
//        }
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
        Hibernate.initialize(result.getChildren());
        Hibernate.initialize(result.getCollectionPhases());
        Hibernate.initialize(result.getCurrency());
        Hibernate.initialize(result.getDebtor());
        Hibernate.initialize(result.getLoanType());
        Hibernate.initialize(result.getLoanState());
        Hibernate.initialize(result.getCreditOrder());
        Hibernate.initialize(result.getLoanState());
        Hibernate.initialize(result.getLoanType());
        Hibernate.initialize(result.getChildren());
        try {
            Hibernate.initialize(result.getParent().getLoanType());
            Hibernate.initialize(result.getParent().getLoanState());
            Hibernate.initialize(result.getParent().getChildren());
            Hibernate.initialize(result.getParent().getCollectionPhases());
            Hibernate.initialize(result.getParent().getCollateralAgreements());
            Hibernate.initialize(result.getParent().getFund());
            Hibernate.initialize(result.getParent().getCreditOrder());
            Hibernate.initialize(result.getParent().getCollaterals());
            Hibernate.initialize(result.getParent().getDebtor());
            Hibernate.initialize(result.getParent().getCurrency());
            Hibernate.initialize(result.getParent().getPayments());
            Hibernate.initialize(result.getParent().getPaymentSchedules());
            Hibernate.initialize(result.getParent().getWriteOffs());
            Hibernate.initialize(result.getParent().getBankrupts());
            Hibernate.initialize(result.getParent().getCreditTerms());
            Hibernate.initialize(result.getParent().getLoanDetailedSummaries());
            Hibernate.initialize(result.getParent().getAccrues());
            Hibernate.initialize(result.getParent().getDebtTransfers());
            Hibernate.initialize(result.getParent().getLoanGoods());
            Hibernate.initialize(result.getParent().getLoanSummaries());
            Hibernate.initialize(result.getParent().getSupervisorPlans());
            Hibernate.initialize(result.getParent().getTargetedUses());
            Hibernate.initialize(result.getParent().getReconstructedLists());
        }
        catch (Exception e){
            System.out.println(e);
        }

        return result;
    }
}
