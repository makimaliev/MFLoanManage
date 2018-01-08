package kg.gov.mf.loan.manage.dao.entity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entity.AppliedEntityState;

@Repository("appliedEntityStateDao")
public class AppliedEntityStateDaoImpl extends AbstractDao<Long, AppliedEntityState> implements AppliedEntityStateDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AppliedEntityState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<AppliedEntityState> states = (List<AppliedEntityState>) criteria.list();
		return states;
	}

	@Override
	public AppliedEntityState findById(long id) {
		return getByKey(id);
	}

	@Override
	public AppliedEntityState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (AppliedEntityState) crit.uniqueResult();
	}

	@Override
	public void save(AppliedEntityState state) {
		persist(state);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        AppliedEntityState state = (AppliedEntityState)crit.uniqueResult();
        delete(state);
	}

}
