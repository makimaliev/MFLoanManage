package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.dao.loan.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.Payment;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

import java.util.Date;
import java.util.List;

@Service("paymentService")
@Transactional
public class PaymentServiceImpl extends GenericServiceImpl<Payment> implements PaymentService{

    @Autowired
    PaymentDao paymentDao;

    @Override
    public List<Payment> getRowsUntilOnDate(Date onDate)
    {
        return this.paymentDao.getRowsUntilOnDate(onDate);
    }

    @Override
    public Payment getRowDayBeforeOnDate(Date onDate)
    {
        return this.paymentDao.getRowDayBeforeOnDate(onDate);
    }

}
