package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermAccrMethod;

public interface OrderTermAccrMethodService {

	OrderTermAccrMethod findById(long id);
	OrderTermAccrMethod findByName(String name);
	void save(OrderTermAccrMethod method);
	void update(OrderTermAccrMethod method);
	void deleteById(long id);
	List<OrderTermAccrMethod> findAll(); 
}
