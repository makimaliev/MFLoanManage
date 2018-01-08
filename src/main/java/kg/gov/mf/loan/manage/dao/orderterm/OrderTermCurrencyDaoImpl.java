package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

@Repository("orderTermCurrencyDao")
public class OrderTermCurrencyDaoImpl extends AbstractDao<Long, OrderTermCurrency> implements OrderTermCurrencyDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermCurrency> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermCurrency> currs = (List<OrderTermCurrency>) criteria.list();
		return currs;
	}

	@Override
	public OrderTermCurrency findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermCurrency findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermCurrency) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermCurrency curr) {
		persist(curr);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermCurrency curr = (OrderTermCurrency)crit.uniqueResult();
        delete(curr);
	}
}
