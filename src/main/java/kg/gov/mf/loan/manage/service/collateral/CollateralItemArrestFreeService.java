package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemArrestFree;

public interface CollateralItemArrestFreeService {
	
	CollateralItemArrestFree findById(long id);
	void save(CollateralItemArrestFree iaf);
	void update(CollateralItemArrestFree iaf);
	void deleteById(long id);
	List<CollateralItemArrestFree> findAll();
	
}
