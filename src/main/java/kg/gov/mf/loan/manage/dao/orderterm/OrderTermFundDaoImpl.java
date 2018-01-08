package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFund;

@Repository("orderTermFundDao")
public class OrderTermFundDaoImpl extends AbstractDao<Long, OrderTermFund> implements OrderTermFundDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermFund> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermFund> funds = (List<OrderTermFund>) criteria.list();
		return funds;
	}

	@Override
	public OrderTermFund findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermFund findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermFund) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermFund fund) {
		persist(fund);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermFund fund = (OrderTermFund)crit.uniqueResult();
        delete(fund);
	}
}
