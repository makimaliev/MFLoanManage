package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.util.DateUtils;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Payment;

import java.util.Date;
import java.util.List;

@Repository("paymentDao")
public class PaymentDaoImpl extends GenericDaoImpl<Payment> implements PaymentDao{

    @Override
    public List<Payment> getRowsUntilOnDateByLoanId(Long loanId, Date onDate)
    {
        return getCurrentSession().createQuery("from Payment where loanId ='"+ loanId + "' and paymentDate < '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' order by paymentDate").list();
    }

    @Override
    public Payment getRowDayBeforeOnDateByLoanId(Long loanId, Date onDate)
    {
        Date date = DateUtils.subtract(onDate, DateUtils.DAY, 1);
        return (Payment) getCurrentSession().createQuery("from Payment where loanId ='"+ loanId + "' and paymentDate = '" + DateUtils.format(date, DateUtils.FORMAT_POSTGRES_DATE) + "'").uniqueResult();
    }

}
