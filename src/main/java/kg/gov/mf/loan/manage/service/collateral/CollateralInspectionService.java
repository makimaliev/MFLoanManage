package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralInspection;

public interface CollateralInspectionService {

	CollateralInspection findById(long id);
	void save(CollateralInspection inspection);
	void update(CollateralInspection inspection);
	void deleteById(long id);
	List<CollateralInspection> findAll();
	
}
