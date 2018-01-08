package kg.gov.mf.loan.manage.service.order;

import java.util.List;

import kg.gov.mf.loan.manage.model.order.CreditOrder;

public interface CreditOrderService {

	CreditOrder findById(long id);
	CreditOrder findByRegNumber(String regNumber);
	void save(CreditOrder order);
	void update(CreditOrder order);
	void deleteById(long id);
	List<CreditOrder> findAll();
	
}
