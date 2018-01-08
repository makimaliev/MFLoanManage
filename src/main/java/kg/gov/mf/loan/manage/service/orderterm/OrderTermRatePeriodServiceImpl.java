package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermRatePeriodDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;

@Service("orderTermRatePeriodService")
@Transactional
public class OrderTermRatePeriodServiceImpl implements OrderTermRatePeriodService{
	
	@Autowired
	private OrderTermRatePeriodDao periodDao;

	@Override
	public OrderTermRatePeriod findById(long id) {
		return this.periodDao.findById(id);
	}

	@Override
	public OrderTermRatePeriod findByName(String name) {
		return this.periodDao.findByName(name);
	}

	@Override
	public void save(OrderTermRatePeriod period) {
		this.periodDao.save(period);
	}

	@Override
	public void update(OrderTermRatePeriod period) {
		OrderTermRatePeriod entity = this.periodDao.findById(period.getId());
        if(entity!=null){
            entity.setName(period.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.periodDao.deleteById(id);
	}

	@Override
	public List<OrderTermRatePeriod> findAll() {
		return this.periodDao.findAll();
	}

}
