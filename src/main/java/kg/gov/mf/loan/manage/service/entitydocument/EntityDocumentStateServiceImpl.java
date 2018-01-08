package kg.gov.mf.loan.manage.service.entitydocument;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entitydocument.EntityDocumentStateDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;

@Service("entityDocumentStateService")
@Transactional
public class EntityDocumentStateServiceImpl implements EntityDocumentStateService{
	
	@Autowired
	private EntityDocumentStateDao stateDao;

	@Override
	public EntityDocumentState findById(long id) {
		return this.stateDao.findById(id);
	}

	@Override
	public EntityDocumentState findByName(String name) {
		return this.stateDao.findByName(name);
	}

	@Override
	public void save(EntityDocumentState state) {
		this.stateDao.save(state);
	}

	@Override
	public void update(EntityDocumentState state) {
		EntityDocumentState entity = this.stateDao.findById(state.getId());
        if(entity!=null){
            entity.setName(state.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.stateDao.deleteById(id);
	}

	@Override
	public List<EntityDocumentState> findAll() {
		return this.stateDao.findAll();
	}

	@Override
	public boolean isStateNameUnique(long id, String name) {
		EntityDocumentState state = findByName(name);
        return (state == null || ((id != 0L) && (state.getId() == id)));
	}

}
