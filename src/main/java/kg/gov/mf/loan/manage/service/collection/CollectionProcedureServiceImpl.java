package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.CollectionProcedure;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collectionProcedureService")
@Transactional
public class CollectionProcedureServiceImpl extends GenericServiceImpl<CollectionProcedure> implements CollectionProcedureService{
}
