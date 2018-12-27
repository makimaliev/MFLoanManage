package kg.gov.mf.loan.manage.dao.debtor;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Owner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository("debtorOwnerDao")
public class OwnerDaoImpl extends GenericDaoImpl<Owner> implements OwnerDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public Owner getById(Long id){
        Owner owner=super.getById(id);
        Hibernate.initialize(owner.getOwnerType());

        return owner;
    }

    @Override
    public Owner getByEntityId(Long id) {
        String baseQuery="select * from owner where entityId='"+id+"'";
        Query query=entityManager.createNativeQuery(baseQuery,Owner.class);

        return (Owner) query.getSingleResult();
    }
}
