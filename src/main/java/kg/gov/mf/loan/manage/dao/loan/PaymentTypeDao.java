package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.PaymentType;

public interface PaymentTypeDao {

	List<PaymentType> findAll();
	PaymentType findById(long id);
	PaymentType findByName(String name);
    void save(PaymentType type);
    void deleteById(long id);
	
}
