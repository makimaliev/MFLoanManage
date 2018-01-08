package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;

public interface OrderTermDaysMethodService {

	OrderTermDaysMethod findById(long id);
	OrderTermDaysMethod findByName(String name);
	void save(OrderTermDaysMethod method);
	void update(OrderTermDaysMethod method);
	void deleteById(long id);
	List<OrderTermDaysMethod> findAll(); 
	
}
