package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.ProcedureType;

public interface ProcedureTypeDao {

	List<ProcedureType> findAll();
	ProcedureType findById(long id);
    void save(ProcedureType entity);
    void deleteById(long id);
	
}
