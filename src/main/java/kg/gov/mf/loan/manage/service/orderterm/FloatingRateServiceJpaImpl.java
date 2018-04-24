package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.dao.orderterm.FloatingRateDao;
import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FloatingRateServiceJpaImpl implements FloatingRateService {
	
	@Autowired
    private FloatingRateDao floatingRateDao;
 
    public void setFloatingRateDao(FloatingRateDao floatingRateDao) {
        this.floatingRateDao = floatingRateDao;
    }
 
    

	@Override
	@Transactional	
	public void create(FloatingRate floatingRate) {
		this.floatingRateDao.create(floatingRate);
		
	}

	@Override
	@Transactional	
	public void edit(FloatingRate floatingRate) {
		this.floatingRateDao.edit(floatingRate);
		
	}

	@Override
	@Transactional	
	public void deleteById(long id) {
		this.floatingRateDao.deleteById(id);
		
	}

	@Override
	@Transactional	
	public FloatingRate findById(long id) {
		return this.floatingRateDao.findById(id);
	}

	@Override
    @Transactional
    public List<FloatingRate> findAll() {
        return this.floatingRateDao.findAll();
    }
}
