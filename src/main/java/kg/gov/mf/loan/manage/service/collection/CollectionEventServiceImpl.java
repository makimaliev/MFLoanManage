package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.CollectionEvent;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collectionEventService")
@Transactional
public class CollectionEventServiceImpl extends GenericServiceImpl<CollectionEvent> implements CollectionEventService{
}
