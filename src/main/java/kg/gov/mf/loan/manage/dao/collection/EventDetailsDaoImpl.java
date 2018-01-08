package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.EventDetails;

@Repository("eventDetailsDao")
public class EventDetailsDaoImpl extends AbstractDao<Long, EventDetails> implements EventDetailsDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<EventDetails> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<EventDetails> entities = (List<EventDetails>) criteria.list();
		return entities;
	}

	@Override
	public EventDetails findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(EventDetails entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        EventDetails entity = (EventDetails)crit.uniqueResult();
        delete(entity);
	}

}
