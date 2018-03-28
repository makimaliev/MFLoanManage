package kg.gov.mf.loan.manage.dao.process;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.process.LoanSummary;

import java.util.Date;

public interface LoanSummaryDao extends GenericDao<LoanSummary> {
    LoanSummary getByOnDateAndLoanId(Date onDate, long loanId);
}