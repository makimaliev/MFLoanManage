package kg.gov.mf.loan.manage.dao.process;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.util.DateUtils;
import kg.gov.mf.loan.manage.model.process.LoanSummary;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository("loanSummaryDao")
public class LoanSummaryDaoImpl extends GenericDaoImpl<LoanSummary> implements LoanSummaryDao {

    @Override
    public LoanSummary getByOnDateAndLoanId(Date onDate, long loanId){
        LoanSummary loanSummary= (LoanSummary) getCurrentSession().createQuery("from LoanSummary where onDate = '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' and loanId = '" + loanId + "'").uniqueResult();
        Hibernate.initialize(loanSummary.getLoan());
        Hibernate.initialize(loanSummary.getLoanSummaryType());

        return loanSummary;
    }

    @Override
    public LoanSummary getById(Long id)
    {
        LoanSummary result = super.getById(id);
        Hibernate.initialize(result.getLoan());
        return result;
    }

}
