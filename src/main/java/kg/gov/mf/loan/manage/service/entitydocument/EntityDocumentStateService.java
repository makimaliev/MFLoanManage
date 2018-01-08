package kg.gov.mf.loan.manage.service.entitydocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;

public interface EntityDocumentStateService {
	
	EntityDocumentState findById(long id);
	EntityDocumentState findByName(String name);
	void save(EntityDocumentState state);
	void update(EntityDocumentState state);
	void deleteById(long id);
	List<EntityDocumentState> findAll(); 
	boolean isStateNameUnique(long id, String name);

}
