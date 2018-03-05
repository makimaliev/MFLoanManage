package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

import java.util.Date;

public interface CreditTermDao extends GenericDao<CreditTerm> {

    CreditTerm getRecentTermByLoanIdAndOnDate(long loanId, Date onDate);
}
