package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kg.gov.mf.loan.manage.dao.orderterm.OrderTermAccrMethodDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermAccrMethod;

@Service("orderTermAccrMethodService")
@Transactional
public class OrderTermAccrMethodServiceImpl implements OrderTermAccrMethodService{
	
	@Autowired
	private OrderTermAccrMethodDao methodDao;

	@Override
	public OrderTermAccrMethod findById(long id) {
		return this.methodDao.findById(id);
	}

	@Override
	public OrderTermAccrMethod findByName(String name) {
		return this.methodDao.findByName(name);
	}

	@Override
	public void save(OrderTermAccrMethod method) {
		this.methodDao.save(method);
	}

	@Override
	public void update(OrderTermAccrMethod method) {
		OrderTermAccrMethod entity = this.methodDao.findById(method.getId());
        if(entity!=null){
            entity.setName(method.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.methodDao.deleteById(id);
	}

	@Override
	public List<OrderTermAccrMethod> findAll() {
		return this.methodDao.findAll();
	}

}
