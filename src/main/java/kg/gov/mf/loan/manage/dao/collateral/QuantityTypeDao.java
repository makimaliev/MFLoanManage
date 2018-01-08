package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.QuantityType;

public interface QuantityTypeDao {

	List<QuantityType> findAll();
	QuantityType findById(long id);
	QuantityType findByName(String name);
    void save(QuantityType type);
    void deleteById(long id);
	
}
