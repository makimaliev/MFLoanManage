package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRateDao {

	public void create(CurrencyRate currencyRate);

	public void edit(CurrencyRate currencyRate);

	public void deleteById(long id);

	public CurrencyRate findById(long id);
	
	public List<CurrencyRate> findAll();

}
