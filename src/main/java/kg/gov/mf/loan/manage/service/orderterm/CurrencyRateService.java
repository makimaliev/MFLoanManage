package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;

import java.util.List;

public interface CurrencyRateService {



	public void create(CurrencyRate currencyRate);

	public void edit(CurrencyRate currencyRate);

	public void deleteById(long id);

	public CurrencyRate findById(long id);
	
	public List<CurrencyRate> findAll();
}
