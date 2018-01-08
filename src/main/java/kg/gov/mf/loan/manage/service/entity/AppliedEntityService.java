package kg.gov.mf.loan.manage.service.entity;

import java.util.List;

import kg.gov.mf.loan.manage.model.entity.AppliedEntity;

public interface AppliedEntityService {

	AppliedEntity findById(long id);
	AppliedEntity findByName(String name);
	void save(AppliedEntity entity);
	void update(AppliedEntity entity);
	void deleteById(long id);
	List<AppliedEntity> findAll();
	
}
