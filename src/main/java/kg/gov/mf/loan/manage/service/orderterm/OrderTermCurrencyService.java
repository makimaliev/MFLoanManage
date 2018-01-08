package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

public interface OrderTermCurrencyService {

	OrderTermCurrency findById(long id);
	OrderTermCurrency findByName(String name);
	void save(OrderTermCurrency curr);
	void update(OrderTermCurrency curr);
	void deleteById(long id);
	List<OrderTermCurrency> findAll(); 

}