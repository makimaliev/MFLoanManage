package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("loanService")
@Transactional
public class LoanServiceImpl extends GenericServiceImpl<Loan> implements LoanService{
}
