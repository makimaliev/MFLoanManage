package kg.gov.mf.loan.manage.dao.entitydocument;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;

@Repository("entityDocumentStateDao")
public class EntityDocumentStateDaoImpl extends GenericDaoImpl<EntityDocumentState> implements EntityDocumentStateDao {

	@Override
	public EntityDocumentState getByName(String name) {
		return (EntityDocumentState) getCurrentSession().createQuery("from EntityDocumentState where name = '" + name + "'").uniqueResult();
	}

}
