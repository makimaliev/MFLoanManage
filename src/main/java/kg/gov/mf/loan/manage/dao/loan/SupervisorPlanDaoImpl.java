package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

@Repository("supervisorPlanDao")
public class SupervisorPlanDaoImpl extends GenericDaoImpl<SupervisorPlan> implements SupervisorPlanDao{
}
