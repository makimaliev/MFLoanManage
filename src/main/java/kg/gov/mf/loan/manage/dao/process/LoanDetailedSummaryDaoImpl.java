package kg.gov.mf.loan.manage.dao.process;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.util.DateUtils;
import kg.gov.mf.loan.manage.model.process.LoanDetailedSummary;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository("loanDetailedSummaryDao")
public class LoanDetailedSummaryDaoImpl extends GenericDaoImpl<LoanDetailedSummary> implements LoanDetailedSummaryDao {

    @Override
    public LoanDetailedSummary getByOnDateAndLoanId(Date onDate, long loanId){
        return (LoanDetailedSummary) getCurrentSession().createQuery("from LoanDetailedSummary where onDate = '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' and loanId = '" + loanId + "'").uniqueResult();
    }

    @Override
    public LoanDetailedSummary getLastSummaryByLoanIdAndLTEOnDate(long loanId, Date onDate)
    {
        Query query = getCurrentSession().createQuery("from LoanDetailedSummary where loanId = '" + loanId + "' and onDate < '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' order by onDate DESC, id desc");
        query.setMaxResults(1);
        return (LoanDetailedSummary) query.uniqueResult();
    }

    @Override
    public LoanDetailedSummary getById(Long id)
    {
        LoanDetailedSummary result = super.getById(id);
        Hibernate.initialize(result.getLoan());
        return result;
    }
}
