package kg.gov.mf.loan.manage.service.collection;

import kg.gov.mf.loan.manage.model.collection.CollectionPhaseIndex;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("collectionPhaseIndexService")
@Transactional
public class CollectionPhaseIndexServiceImpl extends GenericServiceImpl<CollectionPhaseIndex> implements CollectionPhaseIndexService{
}
