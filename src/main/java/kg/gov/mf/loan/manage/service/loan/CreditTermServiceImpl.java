package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.dao.loan.CreditTermDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.CreditTerm;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("creditTermService")
@Transactional
public class CreditTermServiceImpl extends GenericServiceImpl<CreditTerm> implements CreditTermService{

    @Autowired
    CreditTermDao termDao;

    public CreditTerm getRecentTermByLoanId(long loanId)
    {
        return this.termDao.getRecentTermByLoanId(loanId);
    }
}
