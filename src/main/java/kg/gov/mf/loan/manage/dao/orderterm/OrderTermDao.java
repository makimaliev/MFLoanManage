package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

public interface OrderTermDao {

	List<OrderTerm> findAll();
	OrderTerm findById(long id);
    void save(OrderTerm term);
    void deleteById(long id);
	
}
