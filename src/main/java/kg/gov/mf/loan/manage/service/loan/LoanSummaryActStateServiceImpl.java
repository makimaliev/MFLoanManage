package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.LoanSummaryActState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loanSummaryActStateService")
@Transactional
public class LoanSummaryActStateServiceImpl extends GenericServiceImpl<LoanSummaryActState> implements LoanSummaryActStateService{
}
