package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFrequencyType;

@Repository("orderTermFrequencyTypeDao")
public class OrderTermFrequencyTypeDaoImpl extends AbstractDao<Long, OrderTermFrequencyType> implements OrderTermFrequencyTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermFrequencyType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermFrequencyType> types = (List<OrderTermFrequencyType>) criteria.list();
		return types;
	}

	@Override
	public OrderTermFrequencyType findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermFrequencyType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermFrequencyType) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermFrequencyType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermFrequencyType type = (OrderTermFrequencyType)crit.uniqueResult();
        delete(type);
	}

}
