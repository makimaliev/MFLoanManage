package kg.gov.mf.loan.manage.dao.debtor;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Owner;

@Repository("debtorOwnerDao")
public class OwnerDaoImpl extends GenericDaoImpl<Owner> implements OwnerDao{

    @Override
    public Owner getById(Long id){
        Owner owner=super.getById(id);
        Hibernate.initialize(owner.getOwnerType());

        return owner;
    }

}
