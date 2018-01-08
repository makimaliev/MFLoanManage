package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

@Repository("paymentScheduleDao")
public class PaymentScheduleDaoImpl extends AbstractDao<Long, PaymentSchedule> implements PaymentScheduleDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<PaymentSchedule> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<PaymentSchedule> schedules = (List<PaymentSchedule>) criteria.list();
		return schedules;
	}

	@Override
	public PaymentSchedule findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(PaymentSchedule schedule) {
		persist(schedule);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        PaymentSchedule schedule = (PaymentSchedule)crit.uniqueResult();
        delete(schedule);
	}

}
