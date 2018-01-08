package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFrequencyType;

public interface OrderTermFrequencyTypeService {

	OrderTermFrequencyType findById(long id);
	OrderTermFrequencyType findByName(String name);
	void save(OrderTermFrequencyType type);
	void update(OrderTermFrequencyType type);
	void deleteById(long id);
	List<OrderTermFrequencyType> findAll(); 
	
}
