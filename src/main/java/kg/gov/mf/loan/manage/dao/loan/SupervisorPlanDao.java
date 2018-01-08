package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

public interface SupervisorPlanDao {

	List<SupervisorPlan> findAll();
	SupervisorPlan findById(long id);
    void save(SupervisorPlan plan);
    void deleteById(long id);
	
}
