package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.Payment;

public interface PaymentService {

	Payment findById(long id);
	void save(Payment payment);
	void update(Payment payment);
	void deleteById(long id);
	List<Payment> findAll();
	
}
