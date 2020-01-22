package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

public interface SupervisorPlanDao extends GenericDao<SupervisorPlan> {
    void updateLoanDataAfterPlanAdd(long loanId);
}
