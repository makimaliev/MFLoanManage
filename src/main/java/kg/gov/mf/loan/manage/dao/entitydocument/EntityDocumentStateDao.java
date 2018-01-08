package kg.gov.mf.loan.manage.dao.entitydocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;

public interface EntityDocumentStateDao {
	
	List<EntityDocumentState> findAll();
	EntityDocumentState findById(long id);
	EntityDocumentState findByName(String name);
    void save(EntityDocumentState state);
    void deleteById(long id);

}
