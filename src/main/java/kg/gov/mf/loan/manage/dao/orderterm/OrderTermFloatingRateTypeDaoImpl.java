package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;

@Repository("orderTermFloatingRateTypeDao")
public class OrderTermFloatingRateTypeDaoImpl extends AbstractDao<Long, OrderTermFloatingRateType> implements OrderTermFloatingRateTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermFloatingRateType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermFloatingRateType> types = (List<OrderTermFloatingRateType>) criteria.list();
		return types;
	}

	@Override
	public OrderTermFloatingRateType findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermFloatingRateType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermFloatingRateType) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermFloatingRateType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermFloatingRateType type = (OrderTermFloatingRateType)crit.uniqueResult();
        delete(type);
	}

}
