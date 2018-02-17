package kg.gov.mf.loan.manage.dao.loan;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

import java.util.Date;
import java.util.List;

@Repository("paymentScheduleDao")
public class PaymentScheduleDaoImpl extends GenericDaoImpl<PaymentSchedule> implements PaymentScheduleDao{

    @Override
    public List<PaymentSchedule> getRowsUntilOnDate(Date onDate)
    {
        return getCurrentSession().createQuery("from PaymentSchedule where expectedDate < '" + onDate + "' order by expectedDate").list();
    }
}
