package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemInspectionResult;

public interface CollateralItemInspectionResultDao {

	List<CollateralItemInspectionResult> findAll();
	CollateralItemInspectionResult findById(long id);
    void save(CollateralItemInspectionResult result);
    void deleteById(long id);
	
}
