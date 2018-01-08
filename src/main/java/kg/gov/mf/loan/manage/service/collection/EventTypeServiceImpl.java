package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.EventTypeDao;
import kg.gov.mf.loan.manage.model.collection.EventType;

@Service("eventTypeService")
@Transactional
public class EventTypeServiceImpl implements EventTypeService{
	
	@Autowired
	private EventTypeDao dao;

	@Override
	public EventType findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(EventType type) {
		this.dao.save(type);
	}

	@Override
	public void update(EventType type) {
		EventType entity = this.dao.findById(type.getId());
        if(entity!=null){
        	entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<EventType> findAll() {
		return this.dao.findAll();
	}

}
