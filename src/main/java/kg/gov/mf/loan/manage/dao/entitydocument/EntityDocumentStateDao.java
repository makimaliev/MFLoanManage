package kg.gov.mf.loan.manage.dao.entitydocument;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;

public interface EntityDocumentStateDao extends GenericDao<EntityDocumentState> {
	EntityDocumentState getByName(String name);
}
