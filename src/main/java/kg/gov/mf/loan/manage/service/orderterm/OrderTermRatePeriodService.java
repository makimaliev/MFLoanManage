package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;

public interface OrderTermRatePeriodService {

	OrderTermRatePeriod findById(long id);
	OrderTermRatePeriod findByName(String name);
	void save(OrderTermRatePeriod period);
	void update(OrderTermRatePeriod period);
	void deleteById(long id);
	List<OrderTermRatePeriod> findAll(); 
	
}
