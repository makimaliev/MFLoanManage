package kg.gov.mf.loan.manage.dao.collection;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.CollectionProcedure;

@Repository("collectionProcedureDao")
public class CollectionProcedureDaoImpl extends GenericDaoImpl<CollectionProcedure> implements CollectionProcedureDao{

    @Override
    public CollectionProcedure getById(Long id)
    {
        CollectionProcedure result = super.getById(id);
        Hibernate.initialize(result.getCollectionPhases());
        return result;
    }

}
