package kg.gov.mf.loan.manage.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.order.CreditOrderTypeDao;
import kg.gov.mf.loan.manage.model.order.CreditOrderType;

@Service("creditOrderTypeService")
@Transactional
public class CreditOrderTypeServiceImpl implements CreditOrderTypeService{
	
	@Autowired
	private CreditOrderTypeDao typeDao;

	@Override
	public CreditOrderType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public CreditOrderType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(CreditOrderType type) {
		this.typeDao.save(type);
		
	}

	@Override
	public void update(CreditOrderType type) {
		CreditOrderType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<CreditOrderType> findAll() {
		return this.typeDao.findAll();
	}

	@Override
	public boolean isTypeNameUnique(long id, String name) {
		CreditOrderType type = findByName(name);
        return ( type == null || ((id != 0L) && (type.getId() == id)));
	}
}
