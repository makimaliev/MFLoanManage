package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.EventType;

@Repository("eventTypeDao")
public class EventTypeDaoImpl extends AbstractDao<Long, EventType> implements EventTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<EventType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<EventType> entities = (List<EventType>) criteria.list();
		return entities;
	}

	@Override
	public EventType findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(EventType entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        EventType entity = (EventType)crit.uniqueResult();
        delete(entity);
	}

}
