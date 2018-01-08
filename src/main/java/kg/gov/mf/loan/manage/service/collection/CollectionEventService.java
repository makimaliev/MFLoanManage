package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.CollectionEvent;

public interface CollectionEventService {

	CollectionEvent findById(long id);
	void save(CollectionEvent event);
	void update(CollectionEvent event);
	void deleteById(long id);
	List<CollectionEvent> findAll();
	
}
