package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.CollectionPhase;

public interface CollectionPhaseDao {

	List<CollectionPhase> findAll();
	CollectionPhase findById(long id);
    void save(CollectionPhase phase);
    void deleteById(long id);
	
}
