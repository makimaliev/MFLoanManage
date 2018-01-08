package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.EventStatus;

public interface EventStatusDao {

	List<EventStatus> findAll();
	EventStatus findById(long id);
    void save(EventStatus entity);
    void deleteById(long id);
	
}
