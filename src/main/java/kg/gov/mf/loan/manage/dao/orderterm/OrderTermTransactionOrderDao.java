package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

public interface OrderTermTransactionOrderDao {

	List<OrderTermTransactionOrder> findAll();
	OrderTermTransactionOrder findById(long id);
	OrderTermTransactionOrder findByName(String name);
    void save(OrderTermTransactionOrder order);
    void deleteById(long id);
	
}
