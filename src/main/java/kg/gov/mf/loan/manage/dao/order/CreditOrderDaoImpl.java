package kg.gov.mf.loan.manage.dao.order;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Repository("creditOrderDao")
public class CreditOrderDaoImpl extends AbstractDao<Long, CreditOrder> implements CreditOrderDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditOrder> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("regNumber"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CreditOrder> orders = (List<CreditOrder>) criteria.list();
		return orders;
	}

	@Override
	public CreditOrder findById(long id) {
		return getByKey(id);
	}

	@Override
	public CreditOrder findByRegNumber(String regNumber) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("regNumber", regNumber));
        return (CreditOrder) crit.uniqueResult();
	}

	@Override
	public void save(CreditOrder order) {
		persist(order);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CreditOrder order = (CreditOrder)crit.uniqueResult();
        delete(order);
	}
}
