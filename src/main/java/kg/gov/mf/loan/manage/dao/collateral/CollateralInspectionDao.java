package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralInspection;

public interface CollateralInspectionDao {

	List<CollateralInspection> findAll();
	CollateralInspection findById(long id);
	CollateralInspection findByName(String name);
    void save(CollateralInspection inspection);
    void deleteById(long id);
	
}
