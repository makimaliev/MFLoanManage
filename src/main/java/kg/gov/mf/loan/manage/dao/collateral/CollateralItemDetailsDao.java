package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemDetails;

public interface CollateralItemDetailsDao {

	List<CollateralItemDetails> findAll();
	CollateralItemDetails findById(long id);
    void save(CollateralItemDetails details);
    void deleteById(long id);
	
}
