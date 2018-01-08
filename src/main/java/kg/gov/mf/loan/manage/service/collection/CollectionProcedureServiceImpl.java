package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.CollectionProcedureDao;
import kg.gov.mf.loan.manage.model.collection.CollectionProcedure;

@Service("collectionProcedureService")
@Transactional
public class CollectionProcedureServiceImpl implements CollectionProcedureService{
	
	@Autowired
	private CollectionProcedureDao dao;

	@Override
	public CollectionProcedure findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(CollectionProcedure proc) {
		this.dao.save(proc);
	}

	@Override
	public void update(CollectionProcedure proc) {
		CollectionProcedure entity = this.dao.findById(proc.getId());
        if(entity!=null){
        	entity.setStartDate(proc.getStartDate());
        	entity.setCloseDate(proc.getCloseDate());
        	entity.setLastPhase(proc.getLastPhase());
        	entity.setLastStatusId(proc.getLastStatusId());
        	entity.setProcedureStatus(proc.getProcedureStatus());
        	entity.setProcedureType(proc.getProcedureType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<CollectionProcedure> findAll() {
		return this.dao.findAll();
	}

}
