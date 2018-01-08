package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.QuantityType;

public interface QuantityTypeService {

	QuantityType findById(long id);
	QuantityType findByName(String name);
	void save(QuantityType type);
	void update(QuantityType type);
	void deleteById(long id);
	List<QuantityType> findAll(); 
	
}
