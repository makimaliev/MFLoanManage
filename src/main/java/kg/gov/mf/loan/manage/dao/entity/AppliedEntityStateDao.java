package kg.gov.mf.loan.manage.dao.entity;

import java.util.List;

import kg.gov.mf.loan.manage.model.entity.AppliedEntityState;

public interface AppliedEntityStateDao {
	
	List<AppliedEntityState> findAll();
	AppliedEntityState findById(long id);
	AppliedEntityState findByName(String name);
    void save(AppliedEntityState state);
    void deleteById(long id);

}
