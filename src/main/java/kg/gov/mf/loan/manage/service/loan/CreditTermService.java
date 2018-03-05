package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.CreditTerm;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.Date;

public interface CreditTermService extends GenericService<CreditTerm>{

    CreditTerm getRecentTermByLoanIdAndOnDate(long loanId, Date onDate);

}
