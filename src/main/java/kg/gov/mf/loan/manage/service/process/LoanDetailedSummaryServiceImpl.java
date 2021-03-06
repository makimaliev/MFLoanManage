package kg.gov.mf.loan.manage.service.process;

import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import kg.gov.mf.loan.manage.dao.process.LoanDetailedSummaryDao;
import kg.gov.mf.loan.manage.model.process.LoanDetailedSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("loanDetailedSummaryService")
@Transactional
public class LoanDetailedSummaryServiceImpl extends GenericServiceImpl<LoanDetailedSummary> implements LoanDetailedSummaryService {

    @Autowired
    LoanDetailedSummaryDao summaryDao;

    @Override
    public LoanDetailedSummary getByOnDateAndLoanId(Date onDate, long loanId){
        return this.summaryDao.getByOnDateAndLoanId(onDate, loanId);
    }

    @Override
    public LoanDetailedSummary getLastSummaryByLoanIdAndLTEOnDate(long loanId, Date onDate)
    {
        return this.summaryDao.getLastSummaryByLoanIdAndLTEOnDate(loanId, onDate);
    }

}
