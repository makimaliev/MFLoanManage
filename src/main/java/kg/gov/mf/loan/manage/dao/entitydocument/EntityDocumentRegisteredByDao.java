package kg.gov.mf.loan.manage.dao.entitydocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;

public interface EntityDocumentRegisteredByDao {
	
	List<EntityDocumentRegisteredBy> findAll();
	EntityDocumentRegisteredBy findById(long id);
	EntityDocumentRegisteredBy findByName(String name);
    void save(EntityDocumentRegisteredBy rb);
    void deleteById(long id);

}
