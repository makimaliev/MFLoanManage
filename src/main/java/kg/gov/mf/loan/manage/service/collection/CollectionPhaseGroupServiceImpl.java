package kg.gov.mf.loan.manage.service.collection;


import kg.gov.mf.loan.manage.model.collection.CollectionPhaseGroup;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("collectionPhaseGroupService")
@Transactional
public class CollectionPhaseGroupServiceImpl extends GenericServiceImpl<CollectionPhaseGroup> implements CollectionPhaseGroupService{
}
