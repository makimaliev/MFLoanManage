package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.SupervisorPlanDao;
import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

@Service("supervisorPlanService")
@Transactional
public class SupervisorPlanServiceImpl implements SupervisorPlanService{
	
	@Autowired
	private SupervisorPlanDao planDao;

	@Override
	public SupervisorPlan findById(long id) {
		return this.planDao.findById(id);
	}

	@Override
	public void save(SupervisorPlan plan) {
		this.planDao.save(plan);
	}

	@Override
	public void update(SupervisorPlan plan) {
		SupervisorPlan entity = this.planDao.findById(plan.getId());
        if(entity!=null){
        	entity.setDate(plan.getDate());
        	entity.setAmount(plan.getAmount());
        	entity.setPrincipal(plan.getPrincipal());
        	entity.setInterest(plan.getInterest());
        	entity.setPenalty(plan.getPenalty());
        	entity.setFee(plan.getFee());
        	entity.setDescription(plan.getDescription());
        }
	}

	@Override
	public void deleteById(long id) {
		this.planDao.deleteById(id);
	}

	@Override
	public List<SupervisorPlan> findAll() {
		return this.planDao.findAll();
	}

}
