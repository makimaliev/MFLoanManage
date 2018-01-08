package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.EventStatus;

public interface EventStatusService {

	EventStatus findById(long id);
	void save(EventStatus status);
	void update(EventStatus status);
	void deleteById(long id);
	List<EventStatus> findAll();
	
}
