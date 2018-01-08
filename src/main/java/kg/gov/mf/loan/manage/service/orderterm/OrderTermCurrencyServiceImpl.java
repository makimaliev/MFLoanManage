package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermCurrencyDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

@Service("orderTermCurrencyService")
@Transactional
public class OrderTermCurrencyServiceImpl implements OrderTermCurrencyService{
	
	@Autowired
	private OrderTermCurrencyDao currDao;

	@Override
	public OrderTermCurrency findById(long id) {
		return this.currDao.findById(id);
	}

	@Override
	public OrderTermCurrency findByName(String name) {
		return this.currDao.findByName(name);
	}

	@Override
	public void save(OrderTermCurrency method) {
		this.currDao.save(method);
	}

	@Override
	public void update(OrderTermCurrency curr) {
		OrderTermCurrency entity = this.currDao.findById(curr.getId());
        if(entity!=null){
            entity.setName(curr.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.currDao.deleteById(id);
	}

	@Override
	public List<OrderTermCurrency> findAll() {
		return this.currDao.findAll();
	}

}
