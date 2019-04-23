package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.DestinationAccount;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("destinationAccountService")
@Transactional
public class DestinationAccountServiceImpl extends GenericServiceImpl<DestinationAccount> implements DestinationAccountService{
}
