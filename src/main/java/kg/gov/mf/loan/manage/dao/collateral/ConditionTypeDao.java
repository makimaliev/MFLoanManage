package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.ConditionType;

public interface ConditionTypeDao {

	List<ConditionType> findAll();
	ConditionType findById(long id);
	ConditionType findByName(String name);
    void save(ConditionType type);
    void deleteById(long id);
	
}
