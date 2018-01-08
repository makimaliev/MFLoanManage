package kg.gov.mf.loan.manage.service.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entity.AppliedEntityStateDao;
import kg.gov.mf.loan.manage.model.entity.AppliedEntityState;

@Service("appliedEntityStateService")
@Transactional
public class AppliedEntityStateServiceImpl implements AppliedEntityStateService{
	
	@Autowired
	private AppliedEntityStateDao stateDao;

	@Override
	public AppliedEntityState findById(long id) {
		return this.stateDao.findById(id);
	}

	@Override
	public AppliedEntityState findByName(String name) {
		return this.stateDao.findByName(name);
	}

	@Override
	public void save(AppliedEntityState state) {
		this.stateDao.save(state);
	}

	@Override
	public void update(AppliedEntityState state) {
		AppliedEntityState entity = this.stateDao.findById(state.getId());
        if(entity!=null){
            entity.setName(state.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.stateDao.deleteById(id);
	}

	@Override
	public List<AppliedEntityState> findAll() {
		return this.stateDao.findAll();
	}

	@Override
	public boolean isStateNameUnique(long id, String name) {
		AppliedEntityState state = findByName(name);
        return (state == null || ((id != 0L) && (state.getId() == id)));
	}

}
