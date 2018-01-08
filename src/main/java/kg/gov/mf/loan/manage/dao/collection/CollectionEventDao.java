package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.CollectionEvent;

public interface CollectionEventDao {

	List<CollectionEvent> findAll();
	CollectionEvent findById(long id);
    void save(CollectionEvent event);
    void deleteById(long id);
	
}
