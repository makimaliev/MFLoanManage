package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.Payment;

public interface PaymentDao {

	List<Payment> findAll();
	Payment findById(long id);
    void save(Payment payment);
    void deleteById(long id);
	
}
