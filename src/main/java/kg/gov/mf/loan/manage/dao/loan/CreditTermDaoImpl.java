package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.util.DateUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

import java.util.Date;

@Repository("creditTermDao")
public class CreditTermDaoImpl extends GenericDaoImpl<CreditTerm> implements CreditTermDao{

    @Override
    public CreditTerm getRecentTermByLoanIdAndOnDate(long loanId, Date onDate)
    {
        Query query = getCurrentSession().createQuery("from CreditTerm where loanId = '" + loanId + "' and startDate <= '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' order by startDate DESC");
        query.setMaxResults(1);
        return (CreditTerm) query.uniqueResult();
    }
}
