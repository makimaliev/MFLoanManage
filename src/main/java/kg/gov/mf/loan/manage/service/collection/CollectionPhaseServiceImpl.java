package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.CollectionPhase;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collectionPhaseService")
@Transactional
public class CollectionPhaseServiceImpl extends GenericServiceImpl<CollectionPhase> implements CollectionPhaseService {
}
