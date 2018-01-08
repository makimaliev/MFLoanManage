package kg.gov.mf.loan.manage.service.orderdocument;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderdocument.OrderDocumentTypeDao;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocumentType;

@Service("orderDocumentTypeService")
@Transactional
public class OrderDocumentTypeServiceImpl implements OrderDocumentTypeService{
	
	@Autowired
	private OrderDocumentTypeDao typeDao;

	@Override
	public OrderDocumentType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public OrderDocumentType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(OrderDocumentType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(OrderDocumentType type) {
		OrderDocumentType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<OrderDocumentType> findAll() {
		return this.typeDao.findAll();
	}

	@Override
	public boolean isTypeNameUnique(long id, String name) {
		OrderDocumentType type = findByName(name);
        return (type == null || ((id != 0L) && (type.getId() == id)));
	}
}
