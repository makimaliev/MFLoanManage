package kg.gov.mf.loan.manage.dao.entitydocument;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;

public interface EntityDocumentRegisteredByDao extends GenericDao<EntityDocumentRegisteredBy> {
	EntityDocumentRegisteredBy getByName(String name);
}
