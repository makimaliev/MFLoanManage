package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.CollectionEvent;

@Repository("collectionEventDao")
public class CollectionEventDaoImpl extends AbstractDao<Long, CollectionEvent> implements CollectionEventDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollectionEvent> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollectionEvent> events = (List<CollectionEvent>) criteria.list();
		return events;
	}

	@Override
	public CollectionEvent findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollectionEvent event) {
		persist(event);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollectionEvent event = (CollectionEvent)crit.uniqueResult();
        delete(event);
	}

}
