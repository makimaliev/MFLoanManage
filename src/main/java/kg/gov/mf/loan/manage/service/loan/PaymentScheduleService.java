package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

public interface PaymentScheduleService {

	PaymentSchedule findById(long id);
	void save(PaymentSchedule ps);
	void update(PaymentSchedule ps);
	void deleteById(long id);
	List<PaymentSchedule> findAll();
	
}
