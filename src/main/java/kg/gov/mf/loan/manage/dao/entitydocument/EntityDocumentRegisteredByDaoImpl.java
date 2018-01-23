package kg.gov.mf.loan.manage.dao.entitydocument;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;

@Repository("entityDocumentRegisteredByDao")
public class EntityDocumentRegisteredByDaoImpl extends GenericDaoImpl<EntityDocumentRegisteredBy> implements EntityDocumentRegisteredByDao {

	@Override
	public EntityDocumentRegisteredBy getByName(String name) {
		return (EntityDocumentRegisteredBy) getCurrentSession().createQuery("from EntityDocumentRegisteredBy where name = '" + name + "'").uniqueResult();
	}

}
