package kg.gov.mf.loan.manage.dao.collection;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.CollectionEvent;

@Repository("collectionEventDao")
public class CollectionEventDaoImpl extends GenericDaoImpl<CollectionEvent> implements CollectionEventDao{
}
