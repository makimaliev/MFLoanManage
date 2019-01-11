package kg.gov.mf.loan.manage.dao.collection;


import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.CollectionPhaseIndex;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

@Repository("collectionPhaseIndexDao")
public class CollectionPhaseIndexDaoImpl extends GenericDaoImpl<CollectionPhaseIndex> implements CollectionPhaseIndexDao{

    @Override
    public CollectionPhaseIndex getById(Long id){

        CollectionPhaseIndex collectionPhaseIndex=super.getById(id);

        Hibernate.initialize(collectionPhaseIndex.getCollectionPhaseSubIndices());

        return collectionPhaseIndex;
    }

}
