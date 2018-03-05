package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.dao.loan.CreditTermDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.CreditTerm;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

import java.util.Date;

@Service("creditTermService")
@Transactional
public class CreditTermServiceImpl extends GenericServiceImpl<CreditTerm> implements CreditTermService{

    @Autowired
    CreditTermDao termDao;

    public CreditTerm getRecentTermByLoanIdAndOnDate(long loanId, Date onDate)
    {
        return this.termDao.getRecentTermByLoanIdAndOnDate(loanId, onDate);
    }
}
