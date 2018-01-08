package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.ItemType;

public interface ItemTypeService {

	ItemType findById(long id);
	ItemType findByName(String name);
	void save(ItemType type);
	void update(ItemType type);
	void deleteById(long id);
	List<ItemType> findAll(); 
	
}
