package kg.gov.mf.loan.manage.service.debtor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("debtorService")
@Transactional
public class DebtorServiceImpl extends GenericServiceImpl<Debtor> implements DebtorService{
}
