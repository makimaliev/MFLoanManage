package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.QuantityTypeDao;
import kg.gov.mf.loan.manage.model.collateral.QuantityType;

@Service("quantityTypeService")
@Transactional
public class QuantityTypeServiceImpl implements QuantityTypeService{
	
	@Autowired
	private QuantityTypeDao typeDao;

	@Override
	public QuantityType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public QuantityType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(QuantityType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(QuantityType type) {
		QuantityType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<QuantityType> findAll() {
		return this.typeDao.findAll();
	}

}
