package kg.gov.mf.loan.manage.service.process;

import kg.gov.mf.loan.manage.service.GenericService;
import kg.gov.mf.loan.manage.model.process.LoanSummary;

import java.util.Date;
import java.util.List;

public interface LoanSummaryService extends GenericService<LoanSummary> {
    LoanSummary getByOnDateAndLoanId(Date onDate, long loanId);
    List<LoanSummary> getSummariesByOnDateAndLoanId(Date onDate, long loanId);
}
