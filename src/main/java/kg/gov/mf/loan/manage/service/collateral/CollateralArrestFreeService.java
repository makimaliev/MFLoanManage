package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralArrestFree;

public interface CollateralArrestFreeService {

	CollateralArrestFree findById(long id);
	void save(CollateralArrestFree af);
	void update(CollateralArrestFree af);
	void deleteById(long id);
	List<CollateralArrestFree> findAll();
	
}
