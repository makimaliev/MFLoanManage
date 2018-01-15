package kg.gov.mf.loan.manage.dao.entitydocument;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;

@Repository("entityDocumentDao")
public class EntityDocumentDaoImpl extends GenericDaoImpl<EntityDocument> implements EntityDocumentDao {
}