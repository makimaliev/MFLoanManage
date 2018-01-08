package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.CollectionEventDao;
import kg.gov.mf.loan.manage.model.collection.CollectionEvent;

@Service("collectionEventService")
@Transactional
public class CollectionEventServiceImpl implements CollectionEventService{
	
	@Autowired
	private CollectionEventDao dao;

	@Override
	public CollectionEvent findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(CollectionEvent event) {
		this.dao.save(event);
	}

	@Override
	public void update(CollectionEvent event) {
		CollectionEvent entity = this.dao.findById(event.getId());
        if(entity!=null){
        	entity.setStartDate(event.getStartDate());
        	entity.setCloseDate(event.getCloseDate());
        	entity.setEventStatus(event.getEventStatus());
        	entity.setEventType(event.getEventType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<CollectionEvent> findAll() {
		return this.dao.findAll();
	}

}
