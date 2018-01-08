package kg.gov.mf.loan.manage.service.entitydocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;

public interface EntityDocumentRegisteredByService {

	EntityDocumentRegisteredBy findById(long id);
	EntityDocumentRegisteredBy findByName(String name);
	void save(EntityDocumentRegisteredBy rb);
	void update(EntityDocumentRegisteredBy rb);
	void deleteById(long id);
	List<EntityDocumentRegisteredBy> findAll(); 
	boolean isRBNameUnique(long id, String name);
	
}
