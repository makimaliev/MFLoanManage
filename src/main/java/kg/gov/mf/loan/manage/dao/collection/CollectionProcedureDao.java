package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.CollectionProcedure;

public interface CollectionProcedureDao {

	List<CollectionProcedure> findAll();
	CollectionProcedure findById(long id);
    void save(CollectionProcedure procedure);
    void deleteById(long id);
	
}
