package kg.gov.mf.loan.manage.dao.debtor;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.debtor.DebtorSubGroup;

import java.util.List;


public interface DebtorSubGroupDao extends GenericDao<DebtorSubGroup> {

    List<DebtorSubGroup> getByDebtorGroup(Long debtorGroupId);
}
