package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.EventStatus;

@Repository("eventStatusDao")
public class EventStatusDaoImpl extends AbstractDao<Long, EventStatus> implements EventStatusDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<EventStatus> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<EventStatus> entities = (List<EventStatus>) criteria.list();
		return entities;
	}

	@Override
	public EventStatus findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(EventStatus entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        EventStatus entity = (EventStatus)crit.uniqueResult();
        delete(entity);
	}

}
