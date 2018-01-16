package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

@Repository("paymentScheduleDao")
public class PaymentScheduleDaoImpl extends GenericDaoImpl<PaymentSchedule> implements PaymentScheduleDao{
}
