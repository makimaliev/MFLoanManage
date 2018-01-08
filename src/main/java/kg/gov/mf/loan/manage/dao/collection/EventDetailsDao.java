package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.EventDetails;

public interface EventDetailsDao {

	List<EventDetails> findAll();
	EventDetails findById(long id);
    void save(EventDetails entity);
    void deleteById(long id);
	
}
