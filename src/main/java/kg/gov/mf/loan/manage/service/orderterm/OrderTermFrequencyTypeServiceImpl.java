package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermFrequencyTypeDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFrequencyType;

@Service("orderTermFrequencyTypeService")
@Transactional
public class OrderTermFrequencyTypeServiceImpl implements OrderTermFrequencyTypeService{
	
	@Autowired
	private OrderTermFrequencyTypeDao typeDao;

	@Override
	public OrderTermFrequencyType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public OrderTermFrequencyType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(OrderTermFrequencyType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(OrderTermFrequencyType type) {
		OrderTermFrequencyType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<OrderTermFrequencyType> findAll() {
		return this.typeDao.findAll();
	}

}
