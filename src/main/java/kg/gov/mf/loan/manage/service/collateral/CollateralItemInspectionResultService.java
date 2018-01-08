package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemInspectionResult;

public interface CollateralItemInspectionResultService {

	CollateralItemInspectionResult findById(long id);
	void save(CollateralItemInspectionResult result);
	void update(CollateralItemInspectionResult result);
	void deleteById(long id);
	List<CollateralItemInspectionResult> findAll();
	
}
