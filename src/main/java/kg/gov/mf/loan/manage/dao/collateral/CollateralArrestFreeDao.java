package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralArrestFree;

public interface CollateralArrestFreeDao {

	List<CollateralArrestFree> findAll();
	CollateralArrestFree findById(long id);
	CollateralArrestFree findByName(String name);
    void save(CollateralArrestFree af);
    void deleteById(long id);
	
}
