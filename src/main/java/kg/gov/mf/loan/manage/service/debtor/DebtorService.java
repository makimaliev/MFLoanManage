package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.service.GenericService;

public interface DebtorService extends GenericService<Debtor> {
    public Debtor getByOwnerId(Long id);
}
