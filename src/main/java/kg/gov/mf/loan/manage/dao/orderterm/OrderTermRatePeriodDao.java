package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;

public interface OrderTermRatePeriodDao {

	List<OrderTermRatePeriod> findAll();
	OrderTermRatePeriod findById(long id);
	OrderTermRatePeriod findByName(String name);
    void save(OrderTermRatePeriod period);
    void deleteById(long id);
	
}
