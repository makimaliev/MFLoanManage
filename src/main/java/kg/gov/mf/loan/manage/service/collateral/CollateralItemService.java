package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItem;

public interface CollateralItemService {

	CollateralItem findById(long id);
	CollateralItem findByName(String name);
	void save(CollateralItem item);
	void update(CollateralItem item);
	void deleteById(long id);
	List<CollateralItem> findAll();
	
}
