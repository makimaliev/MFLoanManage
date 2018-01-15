package kg.gov.mf.loan.manage.service.entitydocument;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("entityDocumentRegisteredByService")
@Transactional
public class EntityDocumentRegisteredByServiceImpl extends GenericServiceImpl<EntityDocumentRegisteredBy> implements EntityDocumentRegisteredByService{
}
