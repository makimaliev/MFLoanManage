package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

@Repository("orderTermTransactionOrderDao")
public class OrderTermTransactionOrderDaoImpl extends AbstractDao<Long, OrderTermTransactionOrder> implements OrderTermTransactionOrderDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermTransactionOrder> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermTransactionOrder> orders = (List<OrderTermTransactionOrder>) criteria.list();
		return orders;
	}

	@Override
	public OrderTermTransactionOrder findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermTransactionOrder findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermTransactionOrder) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermTransactionOrder order) {
		persist(order);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermTransactionOrder order = (OrderTermTransactionOrder)crit.uniqueResult();
        delete(order);
	}

}
