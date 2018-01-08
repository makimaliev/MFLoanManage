package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;

public interface OrderTermFloatingRateTypeService {

	OrderTermFloatingRateType findById(long id);
	OrderTermFloatingRateType findByName(String name);
	void save(OrderTermFloatingRateType type);
	void update(OrderTermFloatingRateType type);
	void deleteById(long id);
	List<OrderTermFloatingRateType> findAll(); 
	
}
