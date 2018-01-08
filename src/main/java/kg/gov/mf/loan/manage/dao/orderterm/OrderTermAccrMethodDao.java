package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermAccrMethod;

public interface OrderTermAccrMethodDao {
	
	List<OrderTermAccrMethod> findAll();
	OrderTermAccrMethod findById(long id);
	OrderTermAccrMethod findByName(String name);
    void save(OrderTermAccrMethod accrMethod);
    void deleteById(long id);

}
