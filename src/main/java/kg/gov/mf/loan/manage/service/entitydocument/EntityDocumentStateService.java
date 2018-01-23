package kg.gov.mf.loan.manage.service.entitydocument;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;
import kg.gov.mf.loan.manage.service.GenericService;

public interface EntityDocumentStateService extends GenericService<EntityDocumentState>{
	EntityDocumentState getByName(String name);
}
