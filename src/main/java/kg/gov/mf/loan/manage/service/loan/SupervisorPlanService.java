package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

public interface SupervisorPlanService {

	SupervisorPlan findById(long id);
	void save(SupervisorPlan plan);
	void update(SupervisorPlan plan);
	void deleteById(long id);
	List<SupervisorPlan> findAll();
	
}
