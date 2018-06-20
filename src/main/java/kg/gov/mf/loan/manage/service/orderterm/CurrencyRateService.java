package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

import java.util.Date;
import java.util.List;

public interface CurrencyRateService {



	public void create(CurrencyRate currencyRate);

	public void edit(CurrencyRate currencyRate);

	public void deleteById(long id);

	public CurrencyRate findById(long id);

	public CurrencyRate findByDateAndType(Date date, OrderTermCurrency type);
	
	public List<CurrencyRate> findAll();
}
