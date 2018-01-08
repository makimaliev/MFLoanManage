package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.PhaseStatus;

@Repository("phaseStatusDao")
public class PhaseStatusDaoImpl extends AbstractDao<Long, PhaseStatus> implements PhaseStatusDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<PhaseStatus> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<PhaseStatus> entities = (List<PhaseStatus>) criteria.list();
		return entities;
	}

	@Override
	public PhaseStatus findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(PhaseStatus entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        PhaseStatus entity = (PhaseStatus)crit.uniqueResult();
        delete(entity);
	}

}
