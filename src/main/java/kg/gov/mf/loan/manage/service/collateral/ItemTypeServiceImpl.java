package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.ItemTypeDao;
import kg.gov.mf.loan.manage.model.collateral.ItemType;

@Service("itemTypeService")
@Transactional
public class ItemTypeServiceImpl implements ItemTypeService{
	
	@Autowired
	private ItemTypeDao typeDao;

	@Override
	public ItemType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public ItemType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(ItemType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(ItemType type) {
		ItemType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<ItemType> findAll() {
		return this.typeDao.findAll();
	}

}
