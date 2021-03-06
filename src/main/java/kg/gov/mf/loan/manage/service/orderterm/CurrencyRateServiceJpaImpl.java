package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.dao.orderterm.CurrencyRateDao;
import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CurrencyRateServiceJpaImpl implements CurrencyRateService {
	
	@Autowired
    private CurrencyRateDao currencyRateDao;
 
    public void setCurrencyRateDao(CurrencyRateDao currencyRateDao) {
        this.currencyRateDao = currencyRateDao;
    }
 
    

	@Override
	@Transactional	
	public void create(CurrencyRate currencyRate) {
		this.currencyRateDao.add(currencyRate);
		
	}

	@Override
	@Transactional	
	public void edit(CurrencyRate currencyRate) {
		this.currencyRateDao.update(currencyRate);
		
	}

	@Override
	@Transactional	
	public void deleteById(long id) {
		this.currencyRateDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public CurrencyRate findById(long id) {
		return this.currencyRateDao.getById(id);
	}

	@Override
	@Transactional
	public CurrencyRate findByDateAndType(Date date, OrderTermCurrency type) {
		return this.currencyRateDao.findByDateAndType(date, type);
	}


	@Override
    @Transactional
    public List<CurrencyRate> findAll() {
        return this.currencyRateDao.list();
    }
}
