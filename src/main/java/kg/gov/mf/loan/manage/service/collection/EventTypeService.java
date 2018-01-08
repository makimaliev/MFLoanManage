package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.EventType;

public interface EventTypeService {
	
	EventType findById(long id);
	void save(EventType type);
	void update(EventType type);
	void deleteById(long id);
	List<EventType> findAll();
	
}
