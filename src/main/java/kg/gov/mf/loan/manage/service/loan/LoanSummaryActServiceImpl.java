package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.LoanSummaryAct;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loanSummaryActService")
@Transactional
public class LoanSummaryActServiceImpl extends GenericServiceImpl<LoanSummaryAct> implements LoanSummaryActService{
}
