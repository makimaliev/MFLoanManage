package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("supervisorPlanService")
@Transactional
public class SupervisorPlanServiceImpl extends GenericServiceImpl<SupervisorPlan> implements SupervisorPlanService{
}
