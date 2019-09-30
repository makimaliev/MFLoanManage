package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.model.debtor.DebtorSubGroup;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface DebtorSubGroupService extends GenericService<DebtorSubGroup> {

    public List<DebtorSubGroup> getByDebtorGroup(Long debtorGroupId);
}
