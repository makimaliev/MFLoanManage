package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.model.debtor.DebtorActNeeded;
import kg.gov.mf.loan.manage.model.debtor.DebtorActStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("debtorActStatusService")
@Transactional
public class DebtorActStatusServiceImpl extends GenericServiceImpl<DebtorActStatus> implements DebtorActStatusService{
}
