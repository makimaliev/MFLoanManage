package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.InspectionResultType;

public interface InspectionResultTypeDao {

	List<InspectionResultType> findAll();
	InspectionResultType findById(long id);
	InspectionResultType findByName(String name);
    void save(InspectionResultType type);
    void deleteById(long id);
	
}
