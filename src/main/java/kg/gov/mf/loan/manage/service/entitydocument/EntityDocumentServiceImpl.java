package kg.gov.mf.loan.manage.service.entitydocument;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("entityDocumentService")
@Transactional
public class EntityDocumentServiceImpl extends GenericServiceImpl<EntityDocument> implements EntityDocumentService {
}
