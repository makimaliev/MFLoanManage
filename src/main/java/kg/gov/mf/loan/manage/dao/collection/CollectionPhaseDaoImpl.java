package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.CollectionPhase;

@Repository("collectionPhaseDao")
public class CollectionPhaseDaoImpl extends AbstractDao<Long, CollectionPhase> implements CollectionPhaseDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollectionPhase> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollectionPhase> phases = (List<CollectionPhase>) criteria.list();
		return phases;
	}

	@Override
	public CollectionPhase findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollectionPhase phase) {
		persist(phase);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollectionPhase phase = (CollectionPhase)crit.uniqueResult();
        delete(phase);
	}

}
