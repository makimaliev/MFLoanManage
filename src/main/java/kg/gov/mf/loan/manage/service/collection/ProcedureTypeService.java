package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.ProcedureType;

public interface ProcedureTypeService {

	ProcedureType findById(long id);
	void save(ProcedureType type);
	void update(ProcedureType type);
	void deleteById(long id);
	List<ProcedureType> findAll();
	
}
