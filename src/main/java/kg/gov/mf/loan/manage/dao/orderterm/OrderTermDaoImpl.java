package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

@Repository("orderTermDao")
public class OrderTermDaoImpl extends AbstractDao<Long, OrderTerm> implements OrderTermDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTerm> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTerm> terms = (List<OrderTerm>) criteria.list();
		return terms;
	}

	@Override
	public OrderTerm findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(OrderTerm term) {
		persist(term);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTerm term = (OrderTerm)crit.uniqueResult();
        delete(term);
	}

}
