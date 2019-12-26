package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.dao.loan.LoanSummaryActDao;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.loan.LoanSummaryAct;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("loanSummaryActService")
@Transactional
public class LoanSummaryActServiceImpl extends GenericServiceImpl<LoanSummaryAct> implements LoanSummaryActService{

    @Autowired
    LoanSummaryActDao loanSummaryActDao;

    public List<LoanSummaryAct> getLoanSummaryActByDebtor(Debtor debtor)
    {
        return this.loanSummaryActDao.getLoanSummaryActByDebtor(debtor);
    }

    @Override
    public boolean isUneque(String reg_number) {
        return loanSummaryActDao.isUneque(reg_number);
    }
}
