package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemDetails;

public interface CollateralItemDetailsService {

	CollateralItemDetails findById(long id);
	void save(CollateralItemDetails details);
	void update(CollateralItemDetails details);
	void deleteById(long id);
	List<CollateralItemDetails> findAll();
	
}
