package kg.gov.mf.loan.manage.dao.collection;


import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.CollectionPhaseGroup;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

@Repository("collectionPhaseGroupDao")
public class CollectionPhaseGroupDaoImpl extends GenericDaoImpl<CollectionPhaseGroup> implements CollectionPhaseGroupDao{
}
