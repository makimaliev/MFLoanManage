package kg.gov.mf.loan.manage.service.entitydocument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entitydocument.EntityDocumentStateDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("entityDocumentStateService")
@Transactional
public class EntityDocumentStateServiceImpl extends GenericServiceImpl<EntityDocumentState> implements EntityDocumentStateService{
	
	@Autowired
	EntityDocumentStateDao stateDao;

	@Override
	public EntityDocumentState getByName(String name) {
		return this.stateDao.getByName(name);
	}
}
