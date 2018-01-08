package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.PhaseType;

@Repository("phaseTypeDao")
public class PhaseTypeDaoImpl extends AbstractDao<Long, PhaseType> implements PhaseTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<PhaseType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<PhaseType> entities = (List<PhaseType>) criteria.list();
		return entities;
	}

	@Override
	public PhaseType findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(PhaseType entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        PhaseType entity = (PhaseType)crit.uniqueResult();
        delete(entity);
	}

}
