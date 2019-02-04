package kg.gov.mf.loan.manage.service.process;

import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import kg.gov.mf.loan.manage.dao.process.LoanSummaryDao;
import kg.gov.mf.loan.manage.model.process.LoanSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("loanSummaryService")
@Transactional
public class LoanSummaryServiceImpl extends GenericServiceImpl<LoanSummary> implements LoanSummaryService {

    @Autowired
    LoanSummaryDao loanSummaryDao;

    @Override
    public LoanSummary getByOnDateAndLoanId(Date onDate, long loanId)
    {
        return this.loanSummaryDao.getByOnDateAndLoanId(onDate, loanId);
    }

    @Override
    public List<LoanSummary> getSummariesByOnDateAndLoanId(Date onDate, long loanId) {
        return this.loanSummaryDao.getSummariesByOnDateAndLoanId(onDate,loanId);
    }

    @Override
    public LoanSummary getLastByLoanSummaryType(String type) {
        return this.loanSummaryDao.getLastByLoanSummaryType(type);
    }
}
