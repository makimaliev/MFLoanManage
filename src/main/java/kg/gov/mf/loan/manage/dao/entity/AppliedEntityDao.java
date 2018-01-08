package kg.gov.mf.loan.manage.dao.entity;

import java.util.List;

import kg.gov.mf.loan.manage.model.entity.AppliedEntity;

public interface AppliedEntityDao {

	List<AppliedEntity> findAll();
	AppliedEntity findById(long id);
	AppliedEntity findByName(String name);
    void save(AppliedEntity entity);
    void deleteById(long id);
	
}
