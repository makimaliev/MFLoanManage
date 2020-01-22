package kg.gov.mf.loan.manage.dao.loan;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

@Repository("supervisorPlanDao")
public class SupervisorPlanDaoImpl extends GenericDaoImpl<SupervisorPlan> implements SupervisorPlanDao{
    @Override
    public void updateLoanDataAfterPlanAdd(long loanId)
    {
        Query query = getCurrentSession().createSQLQuery("CALL update_child_loan_plan(:loan_id)")
                .setParameter("loan_id", loanId);

        query.executeUpdate();
    }
}
