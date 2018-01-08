package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.EventType;

public interface EventTypeDao {

	List<EventType> findAll();
	EventType findById(long id);
    void save(EventType entity);
    void deleteById(long id);
	
}
