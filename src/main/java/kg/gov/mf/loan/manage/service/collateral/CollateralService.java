package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.Collateral;

public interface CollateralService {

	Collateral findById(long id);
	Collateral findByName(String name);
	void save(Collateral coll);
	void update(Collateral coll);
	void deleteById(long id);
	List<Collateral> findAll();
	
}
