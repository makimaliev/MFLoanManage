package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItem;

public interface CollateralItemDao {

	List<CollateralItem> findAll();
	CollateralItem findById(long id);
	CollateralItem findByName(String name);
    void save(CollateralItem item);
    void deleteById(long id);
	
}
