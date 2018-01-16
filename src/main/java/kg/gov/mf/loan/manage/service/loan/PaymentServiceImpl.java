package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.Payment;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("paymentService")
@Transactional
public class PaymentServiceImpl extends GenericServiceImpl<Payment> implements PaymentService{
}
