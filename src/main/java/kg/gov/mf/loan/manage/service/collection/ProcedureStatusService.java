package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.ProcedureStatus;

public interface ProcedureStatusService {

	ProcedureStatus findById(long id);
	void save(ProcedureStatus status);
	void update(ProcedureStatus status);
	void deleteById(long id);
	List<ProcedureStatus> findAll();
	
}
