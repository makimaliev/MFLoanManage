package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.InspectionResultType;

public interface InspectionResultTypeService {

	InspectionResultType findById(long id);
	InspectionResultType findByName(String name);
	void save(InspectionResultType type);
	void update(InspectionResultType type);
	void deleteById(long id);
	List<InspectionResultType> findAll();
	
}
