package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;

@Repository("orderTermDaysMethodDao")
public class OrderTermDaysMethodDaoImpl extends AbstractDao<Long, OrderTermDaysMethod> implements OrderTermDaysMethodDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermDaysMethod> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermDaysMethod> methods = (List<OrderTermDaysMethod>) criteria.list();
		return methods;
	}

	@Override
	public OrderTermDaysMethod findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermDaysMethod findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermDaysMethod) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermDaysMethod method) {
		persist(method);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermDaysMethod method = (OrderTermDaysMethod)crit.uniqueResult();
        delete(method);
	}

}
