package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.CollectionPhase;

public interface CollectionPhaseService {

	CollectionPhase findById(long id);
	void save(CollectionPhase phase);
	void update(CollectionPhase phase);
	void deleteById(long id);
	List<CollectionPhase> findAll();
	
}
