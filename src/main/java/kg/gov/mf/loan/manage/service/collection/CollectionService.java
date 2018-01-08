package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.Collection;

public interface CollectionService {

	Collection findById(long id);
	void save(Collection collection);
	void deleteById(long id);
	List<Collection> findAll();
	
}
