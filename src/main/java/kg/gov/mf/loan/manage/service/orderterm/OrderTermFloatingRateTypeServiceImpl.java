package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermFloatingRateTypeDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;

@Service("orderTermFloatingRateTypeService")
@Transactional
public class OrderTermFloatingRateTypeServiceImpl implements OrderTermFloatingRateTypeService{

	@Autowired
	private OrderTermFloatingRateTypeDao typeDao;
	
	@Override
	public OrderTermFloatingRateType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public OrderTermFloatingRateType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(OrderTermFloatingRateType type) {
		this.typeDao.save(type);
		
	}

	@Override
	public void update(OrderTermFloatingRateType type) {
		OrderTermFloatingRateType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
		
	}

	@Override
	public List<OrderTermFloatingRateType> findAll() {
		return this.typeDao.findAll();
	}

}
