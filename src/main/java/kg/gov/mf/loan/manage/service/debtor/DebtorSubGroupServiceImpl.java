package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.dao.debtor.DebtorSubGroupDao;
import kg.gov.mf.loan.manage.model.debtor.DebtorSubGroup;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("debtorSubGroupService")
@Transactional
public class DebtorSubGroupServiceImpl extends GenericServiceImpl<DebtorSubGroup> implements DebtorSubGroupService{

    @Autowired
    DebtorSubGroupDao debtorSubGroupDao;

    @Override
    public List<DebtorSubGroup> getByDebtorGroup(Long debtorGroupId) {
        return debtorSubGroupDao.getByDebtorGroup(debtorGroupId);
    }
}
