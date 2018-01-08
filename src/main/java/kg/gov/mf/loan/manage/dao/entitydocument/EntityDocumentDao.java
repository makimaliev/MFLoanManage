package kg.gov.mf.loan.manage.dao.entitydocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;

public interface EntityDocumentDao {

	List<EntityDocument> findAll();
	EntityDocument findById(long id);
	EntityDocument findByName(String name);
	EntityDocument findByRegNumber(String rNumber);
    void save(EntityDocument document);
    void deleteById(long id);
	
}
