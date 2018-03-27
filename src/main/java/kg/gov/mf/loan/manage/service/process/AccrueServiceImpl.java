package kg.gov.mf.loan.manage.service.process;

import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import kg.gov.mf.loan.manage.dao.process.AccrueDao;
import kg.gov.mf.loan.manage.model.process.Accrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("accrueService")
@Transactional
public class AccrueServiceImpl extends GenericServiceImpl<Accrue> implements AccrueService {

    @Autowired
    AccrueDao accrueDao;

    @Override
    public Accrue getByOnDateAndLoanId(Date onDate, long loanId){
        return this.accrueDao.getByOnDateAndLoanId(onDate, loanId);
    }

}
