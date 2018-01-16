package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.PaymentType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("paymentTypeService")
@Transactional
public class PaymentTypeServiceImpl extends GenericServiceImpl<PaymentType> implements PaymentTypeService{
}
