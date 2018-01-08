package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

public interface OrderTermTransactionOrderService {

	OrderTermTransactionOrder findById(long id);
	OrderTermTransactionOrder findByName(String name);
	void save(OrderTermTransactionOrder order);
	void update(OrderTermTransactionOrder order);
	void deleteById(long id);
	List<OrderTermTransactionOrder> findAll(); 
	
}
