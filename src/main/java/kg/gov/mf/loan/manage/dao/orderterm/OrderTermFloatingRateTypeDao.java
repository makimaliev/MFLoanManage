package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;

public interface OrderTermFloatingRateTypeDao {

	List<OrderTermFloatingRateType> findAll();
	OrderTermFloatingRateType findById(long id);
	OrderTermFloatingRateType findByName(String name);
    void save(OrderTermFloatingRateType type);
    void deleteById(long id);
	
}
