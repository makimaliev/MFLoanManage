package kg.gov.mf.loan.manage.dao.debtor;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Owner;

@Repository("debtorOwnerDao")
public class OwnerDaoImpl extends GenericDaoImpl<Owner> implements OwnerDao{

}
