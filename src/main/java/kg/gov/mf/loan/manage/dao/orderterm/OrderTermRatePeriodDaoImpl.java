package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;

@Repository("orderTermRatePeriodDao")
public class OrderTermRatePeriodDaoImpl extends AbstractDao<Long, OrderTermRatePeriod> implements OrderTermRatePeriodDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermRatePeriod> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermRatePeriod> periods = (List<OrderTermRatePeriod>) criteria.list();
		return periods;
	}

	@Override
	public OrderTermRatePeriod findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermRatePeriod findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermRatePeriod) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermRatePeriod period) {
		persist(period);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermRatePeriod period = (OrderTermRatePeriod)crit.uniqueResult();
        delete(period);
	}

}
