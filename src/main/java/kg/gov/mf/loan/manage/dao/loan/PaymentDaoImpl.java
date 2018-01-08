package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.Payment;

@Repository("paymentDao")
public class PaymentDaoImpl extends AbstractDao<Long, Payment> implements PaymentDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Payment> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Payment> payments = (List<Payment>) criteria.list();
		return payments;
	}

	@Override
	public Payment findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(Payment payment) {
		persist(payment);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Payment payment = (Payment)crit.uniqueResult();
        delete(payment);
	}

}
