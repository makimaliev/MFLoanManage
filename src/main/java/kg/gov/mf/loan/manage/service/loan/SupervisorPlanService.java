package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;
import kg.gov.mf.loan.manage.service.GenericService;

public interface SupervisorPlanService extends GenericService<SupervisorPlan> {
    void updateLoanDataAfterPlanAdd(long loanId);
}
