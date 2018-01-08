package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.ConditionType;

public interface ConditionTypeService {

	ConditionType findById(long id);
	ConditionType findByName(String name);
	void save(ConditionType type);
	void update(ConditionType type);
	void deleteById(long id);
	List<ConditionType> findAll(); 
	
}
