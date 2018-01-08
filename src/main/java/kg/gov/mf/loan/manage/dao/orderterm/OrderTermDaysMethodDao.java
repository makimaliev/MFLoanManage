package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;

public interface OrderTermDaysMethodDao {

	List<OrderTermDaysMethod> findAll();
	OrderTermDaysMethod findById(long id);
	OrderTermDaysMethod findByName(String name);
    void save(OrderTermDaysMethod method);
    void deleteById(long id);
	
}
