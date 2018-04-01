package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.dao.loan.PaymentScheduleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

import java.util.Date;
import java.util.List;

@Service("paymentScheduleService")
@Transactional
public class PaymentScheduleServiceImpl extends GenericServiceImpl<PaymentSchedule> implements PaymentScheduleService{

    @Autowired
    PaymentScheduleDao scheduleDao;

    @Override
    public List<PaymentSchedule> getRowsUntilOnDateByLoanId(Long loanId, Date onDate)
    {
        return this.scheduleDao.getRowsUntilOnDateByLoanId(loanId, onDate);
    }

}
