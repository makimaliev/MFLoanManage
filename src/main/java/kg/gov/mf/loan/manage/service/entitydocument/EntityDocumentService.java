package kg.gov.mf.loan.manage.service.entitydocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;

public interface EntityDocumentService {
	
	EntityDocument findById(long id);
	EntityDocument findByName(String name);
	EntityDocument findByRegisteredNumber(String rNumber);
	void save(EntityDocument doc);
	void update(EntityDocument doc);
	void deleteById(long id);
	List<EntityDocument> findAll();

}
