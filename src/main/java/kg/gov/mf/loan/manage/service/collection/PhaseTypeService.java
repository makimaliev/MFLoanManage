package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.PhaseType;

public interface PhaseTypeService {

	PhaseType findById(long id);
	void save(PhaseType type);
	void update(PhaseType type);
	void deleteById(long id);
	List<PhaseType> findAll();
	
}
