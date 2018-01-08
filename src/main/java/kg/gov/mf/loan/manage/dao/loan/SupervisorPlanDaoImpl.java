package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.SupervisorPlan;

@Repository("supervisorPlanDao")
public class SupervisorPlanDaoImpl extends AbstractDao<Long, SupervisorPlan> implements SupervisorPlanDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<SupervisorPlan> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<SupervisorPlan> plans = (List<SupervisorPlan>) criteria.list();
		return plans;
	}

	@Override
	public SupervisorPlan findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(SupervisorPlan plan) {
		persist(plan);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        SupervisorPlan plan = (SupervisorPlan)crit.uniqueResult();
        delete(plan);
	}

}
