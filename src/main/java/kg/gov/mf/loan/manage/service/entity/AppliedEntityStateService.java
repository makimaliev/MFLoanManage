package kg.gov.mf.loan.manage.service.entity;

import java.util.List;

import kg.gov.mf.loan.manage.model.entity.AppliedEntityState;

public interface AppliedEntityStateService {

	AppliedEntityState findById(long id);
	AppliedEntityState findByName(String name);
	void save(AppliedEntityState state);
	void update(AppliedEntityState state);
	void deleteById(long id);
	List<AppliedEntityState> findAll(); 
	boolean isStateNameUnique(long id, String name);
	
}
