package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFund;

public interface OrderTermFundService {

	OrderTermFund findById(long id);
	OrderTermFund findByName(String name);
	void save(OrderTermFund fund);
	void update(OrderTermFund fund);
	void deleteById(long id);
	List<OrderTermFund> findAll(); 
	
}
