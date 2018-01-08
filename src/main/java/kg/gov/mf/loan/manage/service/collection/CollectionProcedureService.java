package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.CollectionProcedure;

public interface CollectionProcedureService {

	CollectionProcedure findById(long id);
	void save(CollectionProcedure proc);
	void update(CollectionProcedure proc);
	void deleteById(long id);
	List<CollectionProcedure> findAll();
	
}
