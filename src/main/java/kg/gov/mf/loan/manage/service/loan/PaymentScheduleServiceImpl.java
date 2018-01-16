package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("paymentScheduleService")
@Transactional
public class PaymentScheduleServiceImpl extends GenericServiceImpl<PaymentSchedule> implements PaymentScheduleService{
}
