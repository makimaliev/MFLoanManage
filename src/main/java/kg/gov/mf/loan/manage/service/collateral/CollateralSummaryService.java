package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralSummary;

public interface CollateralSummaryService {

	CollateralSummary findById(long id);
	void save(CollateralSummary summary);
	void update(CollateralSummary summary);
	void deleteById(long id);
	List<CollateralSummary> findAll();
	
}
