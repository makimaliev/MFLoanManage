package kg.gov.mf.loan.manage.dao.collection;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.CollectionPhase;

@Repository("collectionPhaseDao")
public class CollectionPhaseDaoImpl extends GenericDaoImpl<CollectionPhase> implements CollectionPhaseDao{

    @Override
    public CollectionPhase getById(Long id)
    {
        CollectionPhase result = super.getById(id);
        Hibernate.initialize(result.getCollectionEvents());
        Hibernate.initialize(result.getLoans());
        Hibernate.initialize(result.getLoans());
        Hibernate.initialize(result.getPhaseStatus());
        Hibernate.initialize(result.getPhaseType());
        Hibernate.initialize(result.getPhaseDetails());
        Hibernate.initialize(result.getCollectionProcedure());
        Hibernate.initialize(result.getCollectionPhaseGroup());
        Hibernate.initialize(result.getCollectionPhaseIndex());
        try{
            Hibernate.initialize(result.getCollectionProcedure().getProcedureStatus());
        }
        catch (Exception e){

        }
        return result;
    }
}
