package kg.gov.mf.loan.manage.dao.debtor;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.debtor.Owner;

public interface OwnerDao extends GenericDao<Owner>{

    public Owner getByEntityId(Long id,String ownerType);

}
