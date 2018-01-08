package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.CollectionPhaseDao;
import kg.gov.mf.loan.manage.model.collection.CollectionPhase;

@Service("collectionPhaseService")
@Transactional
public class CollectionPhaseServiceImpl implements CollectionPhaseService {
	
	@Autowired
	private CollectionPhaseDao dao;

	@Override
	public CollectionPhase findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(CollectionPhase phase) {
		this.dao.save(phase);
	}

	@Override
	public void update(CollectionPhase phase) {
		CollectionPhase entity = this.dao.findById(phase.getId());
        if(entity!=null){
        	entity.setStartDate(phase.getStartDate());
        	entity.setCloseDate(phase.getCloseDate());
        	entity.setLastEvent(phase.getLastEvent());
        	entity.setLastStatusId(phase.getLastStatusId());
        	entity.setPhaseStatus(phase.getPhaseStatus());
        	entity.setPhaseType(phase.getPhaseType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<CollectionPhase> findAll() {
		return this.dao.findAll();
	}

}
