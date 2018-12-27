package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.service.GenericService;

public interface OwnerService extends GenericService<Owner>{

    public Owner getByEntityId(Long id);
}
