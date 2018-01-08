package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFund;

public interface OrderTermFundDao {

	List<OrderTermFund> findAll();
	OrderTermFund findById(long id);
	OrderTermFund findByName(String name);
    void save(OrderTermFund fund);
    void deleteById(long id);
	
}
