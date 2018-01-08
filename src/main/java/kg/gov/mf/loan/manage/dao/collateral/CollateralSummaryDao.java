package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralSummary;

public interface CollateralSummaryDao {

	List<CollateralSummary> findAll();
	CollateralSummary findById(long id);
    void save(CollateralSummary summary);
    void deleteById(long id);
	
}
