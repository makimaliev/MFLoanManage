package kg.gov.mf.loan.manage.dao.entitylist;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListState;

@Repository("appliedEntityListStateDao")
public class AppliedEntityListStateDaoImpl extends AbstractDao<Long, AppliedEntityListState> implements AppliedEntityListStateDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AppliedEntityListState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<AppliedEntityListState> states = (List<AppliedEntityListState>) criteria.list();
		return states;
	}

	@Override
	public AppliedEntityListState findById(long id) {
		return getByKey(id);
	}

	@Override
	public AppliedEntityListState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (AppliedEntityListState) crit.uniqueResult();
	}

	@Override
	public void save(AppliedEntityListState state) {
		persist(state);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        AppliedEntityListState state = (AppliedEntityListState)crit.uniqueResult();
        delete(state);
	}

}
