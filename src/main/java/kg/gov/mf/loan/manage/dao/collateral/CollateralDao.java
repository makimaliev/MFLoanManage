package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.Collateral;

public interface CollateralDao {

	List<Collateral> findAll();
	Collateral findById(long id);
	Collateral findByName(String name);
    void save(Collateral collateral);
    void deleteById(long id);
	
}
