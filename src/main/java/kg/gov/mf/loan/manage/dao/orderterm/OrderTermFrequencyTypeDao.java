package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFrequencyType;

public interface OrderTermFrequencyTypeDao {

	List<OrderTermFrequencyType> findAll();
	OrderTermFrequencyType findById(long id);
	OrderTermFrequencyType findByName(String name);
    void save(OrderTermFrequencyType type);
    void deleteById(long id);
	
}
