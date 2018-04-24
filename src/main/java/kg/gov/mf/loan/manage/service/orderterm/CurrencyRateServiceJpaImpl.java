package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.dao.orderterm.CurrencyRateDao;
import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		this.currencyRateDao.create(currencyRate);
		
	}

	@Override
	@Transactional	
	public void edit(CurrencyRate currencyRate) {
		this.currencyRateDao.edit(currencyRate);
		
	}

	@Override
	@Transactional	
	public void deleteById(long id) {
		this.currencyRateDao.deleteById(id);
		
	}

	@Override
	@Transactional	
	public CurrencyRate findById(long id) {
		return this.currencyRateDao.findById(id);
	}

	@Override
    @Transactional
    public List<CurrencyRate> findAll() {
        return this.currencyRateDao.findAll();
    }
}
