package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.PaymentType;

public interface PaymentTypeService {

	PaymentType findById(long id);
	PaymentType findByName(String name);
	void save(PaymentType type);
	void update(PaymentType type);
	void deleteById(long id);
	List<PaymentType> findAll();
	
}
