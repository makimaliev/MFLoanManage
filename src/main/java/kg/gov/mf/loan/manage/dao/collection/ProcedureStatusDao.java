package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.ProcedureStatus;

public interface ProcedureStatusDao {

	List<ProcedureStatus> findAll();
	ProcedureStatus findById(long id);
    void save(ProcedureStatus entity);
    void deleteById(long id);
	
}
