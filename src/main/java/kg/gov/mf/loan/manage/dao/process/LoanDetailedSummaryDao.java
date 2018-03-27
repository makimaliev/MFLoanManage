package kg.gov.mf.loan.manage.dao.process;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.process.LoanDetailedSummary;

import java.util.Date;

public interface LoanDetailedSummaryDao extends GenericDao<LoanDetailedSummary> {

    LoanDetailedSummary getByOnDateAndLoanId(Date onDate, long loanId);
    LoanDetailedSummary getLastSummaryByLoanIdAndLTEOnDate(long loanId, Date onDate);

}
