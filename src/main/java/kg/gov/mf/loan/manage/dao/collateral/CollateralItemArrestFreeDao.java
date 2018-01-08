package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemArrestFree;

public interface CollateralItemArrestFreeDao {

	List<CollateralItemArrestFree> findAll();
	CollateralItemArrestFree findById(long id);
    void save(CollateralItemArrestFree iaf);
    void deleteById(long id);
	
}
