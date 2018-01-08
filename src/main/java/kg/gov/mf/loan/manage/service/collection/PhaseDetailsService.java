package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.PhaseDetails;

public interface PhaseDetailsService {

	PhaseDetails findById(long id);
	void save(PhaseDetails details);
	void update(PhaseDetails details);
	void deleteById(long id);
	List<PhaseDetails> findAll();
	
}
