package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.PaymentType;

@Repository("paymentTypeDao")
public class PaymentTypeDaoImpl extends AbstractDao<Long, PaymentType> implements PaymentTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<PaymentType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<PaymentType> types = (List<PaymentType>) criteria.list();
		return types;
	}

	@Override
	public PaymentType findById(long id) {
		return getByKey(id);
	}

	@Override
	public PaymentType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (PaymentType) crit.uniqueResult();
	}

	@Override
	public void save(PaymentType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        PaymentType type = (PaymentType)crit.uniqueResult();
        delete(type);
	}

}
