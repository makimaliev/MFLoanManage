package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

public interface PaymentScheduleDao {

	List<PaymentSchedule> findAll();
	PaymentSchedule findById(long id);
    void save(PaymentSchedule schedule);
    void deleteById(long id);
	
}
