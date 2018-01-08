package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

public interface OrderTermCurrencyDao {

	List<OrderTermCurrency> findAll();
	OrderTermCurrency findById(long id);
	OrderTermCurrency findByName(String name);
    void save(OrderTermCurrency curr);
    void deleteById(long id);
    
}
