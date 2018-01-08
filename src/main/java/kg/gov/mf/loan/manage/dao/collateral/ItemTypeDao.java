package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.ItemType;

public interface ItemTypeDao {

	List<ItemType> findAll();
	ItemType findById(long id);
	ItemType findByName(String name);
    void save(ItemType type);
    void deleteById(long id);
	
}
