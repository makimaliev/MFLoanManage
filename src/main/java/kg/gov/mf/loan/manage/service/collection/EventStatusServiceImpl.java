package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.EventStatusDao;
import kg.gov.mf.loan.manage.model.collection.EventStatus;

@Service("eventStatusService")
@Transactional
public class EventStatusServiceImpl implements EventStatusService{
	
	@Autowired
	private EventStatusDao dao;

	@Override
	public EventStatus findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(EventStatus status) {
		this.dao.save(status);
	}

	@Override
	public void update(EventStatus status) {
		EventStatus entity = this.dao.findById(status.getId());
        if(entity!=null){
        	entity.setName(status.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<EventStatus> findAll() {
		return this.dao.findAll();
	}

}
