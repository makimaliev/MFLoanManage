package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralItemDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItem;

@Service("collateralItemService")
@Transactional
public class CollateralItemServiceImpl implements CollateralItemService {
	
	@Autowired
	private CollateralItemDao itemDao;

	@Override
	public CollateralItem findById(long id) {
		return this.itemDao.findById(id);
	}

	@Override
	public CollateralItem findByName(String name) {
		return this.itemDao.findByName(name);
	}

	@Override
	public void save(CollateralItem item) {
		this.itemDao.save(item);
	}

	@Override
	public void update(CollateralItem item) {
		CollateralItem entity = this.itemDao.findById(item.getId());
        if(entity!=null){
        	entity.setName(item.getName());
        	entity.setDescription(item.getDescription());
        	entity.setItemType(item.getItemType());
        	entity.setQuantity(item.getQuantity());
        	entity.setQuantityType(item.getQuantityType());
        	entity.setCollateralValue(item.getCollateralValue());
        	entity.setEstimatedValue(item.getEstimatedValue());
        	entity.setConditionType(item.getConditionType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.itemDao.deleteById(id);
	}

	@Override
	public List<CollateralItem> findAll() {
		return this.itemDao.findAll();
	}

}
