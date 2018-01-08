package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

public interface OrderTermService {

	OrderTerm findById(long id);
	void save(OrderTerm term);
	void update(OrderTerm term);
	void deleteById(long id);
	List<OrderTerm> findAll();
	
}
