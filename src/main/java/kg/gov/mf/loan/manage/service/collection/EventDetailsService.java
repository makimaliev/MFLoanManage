package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.EventDetails;

public interface EventDetailsService {

	EventDetails findById(long id);
	void save(EventDetails details);
	void update(EventDetails details);
	void deleteById(long id);
	List<EventDetails> findAll();
	
}
