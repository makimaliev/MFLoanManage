package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.dao.orderterm.FloatingRateDao;
import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FloatingRateServiceJpaImpl extends GenericServiceImpl<FloatingRate> implements FloatingRateService {
	
	@Autowired
    private FloatingRateDao floatingRateDao;
 
    public void setFloatingRateDao(FloatingRateDao floatingRateDao) {
        this.floatingRateDao = floatingRateDao;
    }
 
    

	@Override
	@Transactional	
	public void create(FloatingRate floatingRate) {
		this.floatingRateDao.add(floatingRate);
		
	}

	@Override
	@Transactional	
	public void edit(FloatingRate floatingRate) {
		this.floatingRateDao.update(floatingRate);
		
	}

	@Override
	@Transactional	
	public void deleteById(long id) {
		this.floatingRateDao.deleteById(id);
		
	}

	@Override
	@Transactional	
	public FloatingRate findById(long id) {
		return this.floatingRateDao.getById(id);
	}

	@Override
    @Transactional
    public List<FloatingRate> findAll() {
        return this.floatingRateDao.list();
    }
}
