package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermDaysMethodDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;

@Service("orderTermDaysMethodService")
@Transactional
public class OrderTermDaysMethodServiceImpl implements OrderTermDaysMethodService{
	
	@Autowired
	private OrderTermDaysMethodDao methodDao;

	@Override
	public OrderTermDaysMethod findById(long id) {
		return this.methodDao.findById(id);
	}

	@Override
	public OrderTermDaysMethod findByName(String name) {
		return this.methodDao.findByName(name);
	}

	@Override
	public void save(OrderTermDaysMethod method) {
		this.methodDao.save(method);
		
	}

	@Override
	public void update(OrderTermDaysMethod method) {
		OrderTermDaysMethod entity = this.methodDao.findById(method.getId());
        if(entity!=null){
            entity.setName(method.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.methodDao.deleteById(id);
	}

	@Override
	public List<OrderTermDaysMethod> findAll() {
		return this.methodDao.findAll();
	}

}
