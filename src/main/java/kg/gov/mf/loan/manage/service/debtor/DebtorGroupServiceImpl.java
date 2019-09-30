package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.model.debtor.DebtorGroup;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("debtorGroupService")
@Transactional
public class DebtorGroupServiceImpl extends GenericServiceImpl<DebtorGroup> implements DebtorGroupService{
}
