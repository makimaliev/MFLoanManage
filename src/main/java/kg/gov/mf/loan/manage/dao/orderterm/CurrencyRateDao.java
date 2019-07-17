package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CurrencyRateDao extends GenericDao<CurrencyRate> {
	public void deleteById(long id);

	public CurrencyRate findByDateAndType(Date date, OrderTermCurrency type);

}
