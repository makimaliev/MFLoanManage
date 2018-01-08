package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.PhaseStatus;

public interface PhaseStatusService {
	
	PhaseStatus findById(long id);
	void save(PhaseStatus status);
	void update(PhaseStatus status);
	void deleteById(long id);
	List<PhaseStatus> findAll();

}
