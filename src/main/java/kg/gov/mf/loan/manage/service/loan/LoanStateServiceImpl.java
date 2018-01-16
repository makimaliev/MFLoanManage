package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.LoanState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("loanStateService")
@Transactional
public class LoanStateServiceImpl extends GenericServiceImpl<LoanState> implements LoanStateService {
}
