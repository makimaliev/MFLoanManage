package kg.gov.mf.loan.manage.dao.collection;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.CollectionPhaseSubIndex;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

@Repository("collectionPhaseSubIndexDao")
public class CollectionPhaseSubIndexDaoImpl extends GenericDaoImpl<CollectionPhaseSubIndex> implements CollectionPhaseSubIndexDao{

    @Override
    public CollectionPhaseSubIndex getById(Long id){
        CollectionPhaseSubIndex collectionPhaseSubIndex=super.getById(id);
        Hibernate.initialize(collectionPhaseSubIndex.getCollectionPhaseIndex());
        return collectionPhaseSubIndex;
    }

}
