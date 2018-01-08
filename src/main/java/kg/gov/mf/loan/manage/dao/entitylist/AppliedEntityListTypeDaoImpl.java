package kg.gov.mf.loan.manage.dao.entitylist;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListType;

@Repository("appliedEntityListTypeDao")
public class AppliedEntityListTypeDaoImpl extends AbstractDao<Long, AppliedEntityListType> implements AppliedEntityListTypeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AppliedEntityListType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<AppliedEntityListType> types = (List<AppliedEntityListType>) criteria.list();
		return types;
	}

	@Override
	public AppliedEntityListType findById(long id) {
		return getByKey(id);
	}

	@Override
	public AppliedEntityListType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (AppliedEntityListType) crit.uniqueResult();
	}

	@Override
	public void save(AppliedEntityListType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        AppliedEntityListType state = (AppliedEntityListType)crit.uniqueResult();
        delete(state);
	}

}
