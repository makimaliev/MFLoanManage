package kg.gov.mf.loan.manage.service.entitydocument;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("entityDocumentStateService")
@Transactional
public class EntityDocumentStateServiceImpl extends GenericServiceImpl<EntityDocumentState> implements EntityDocumentStateService{
}
