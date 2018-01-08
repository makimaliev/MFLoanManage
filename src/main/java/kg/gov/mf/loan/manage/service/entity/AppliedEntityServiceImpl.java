package kg.gov.mf.loan.manage.service.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entity.AppliedEntityDao;
import kg.gov.mf.loan.manage.model.entity.AppliedEntity;

@Service("appliedEntityService")
@Transactional
public class AppliedEntityServiceImpl implements AppliedEntityService{
	
	@Autowired
	private AppliedEntityDao entityDao;

	@Override
	public AppliedEntity findById(long id) {
		return this.entityDao.findById(id);
	}

	@Override
	public AppliedEntity findByName(String name) {
		return this.entityDao.findByName(name);
	}

	@Override
	public void save(AppliedEntity entity) {
		this.entityDao.save(entity);
	}

	@Override
	public void update(AppliedEntity ent) {
		AppliedEntity entity = this.entityDao.findById(ent.getId());
        if(entity!=null){
        	entity.setName(ent.getName());
        	entity.setAppliedEntityState(ent.getAppliedEntityState());
        }
	}

	@Override
	public void deleteById(long id) {
		this.entityDao.deleteById(id);
	}

	@Override
	public List<AppliedEntity> findAll() {
		return this.entityDao.findAll();
	}

}
