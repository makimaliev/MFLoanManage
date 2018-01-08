package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermAccrMethod;

@Repository("orderTermAccrMethodDao")
public class OrderTermAccrMethodDaoImpl  extends AbstractDao<Long, OrderTermAccrMethod> implements OrderTermAccrMethodDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTermAccrMethod> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderTermAccrMethod> methods = (List<OrderTermAccrMethod>) criteria.list();
		return methods;
	}

	@Override
	public OrderTermAccrMethod findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderTermAccrMethod findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderTermAccrMethod) crit.uniqueResult();
	}

	@Override
	public void save(OrderTermAccrMethod accrMethod) {
		persist(accrMethod);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderTermAccrMethod method = (OrderTermAccrMethod)crit.uniqueResult();
        delete(method);
	}

	
	
}
