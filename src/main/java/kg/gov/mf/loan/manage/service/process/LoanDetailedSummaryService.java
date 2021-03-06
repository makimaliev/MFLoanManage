package kg.gov.mf.loan.manage.service.process;

import kg.gov.mf.loan.manage.service.GenericService;
import kg.gov.mf.loan.manage.model.process.LoanDetailedSummary;

import java.util.Date;

public interface LoanDetailedSummaryService extends GenericService<LoanDetailedSummary> {

    LoanDetailedSummary getByOnDateAndLoanId(Date onDate, long loanId);
    LoanDetailedSummary getLastSummaryByLoanIdAndLTEOnDate(long loanId, Date onDate);

}
