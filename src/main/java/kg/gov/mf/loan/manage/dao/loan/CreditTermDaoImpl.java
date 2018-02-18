package kg.gov.mf.loan.manage.dao.loan;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

@Repository("creditTermDao")
public class CreditTermDaoImpl extends GenericDaoImpl<CreditTerm> implements CreditTermDao{

    @Override
    public CreditTerm getRecentTermByLoanId(long loanId)
    {
        Query query = getCurrentSession().createQuery("from CreditTerm where loanId = '" + loanId + "' order by startDate DESC");
        query.setMaxResults(1);
        return (CreditTerm) query.uniqueResult();
    }
}
