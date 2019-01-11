package kg.gov.mf.loan.manage.service.collection;


import kg.gov.mf.loan.manage.model.collection.CollectionPhaseSubIndex;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("collectionPhaseSubIndexService")
@Transactional
public class CollectionPhaseSubIndexServiceImpl extends GenericServiceImpl<CollectionPhaseSubIndex> implements CollectionPhaseSubIndexService{
}
