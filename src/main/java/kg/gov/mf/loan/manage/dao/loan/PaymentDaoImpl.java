package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Payment;

@Repository("paymentDao")
public class PaymentDaoImpl extends GenericDaoImpl<Payment> implements PaymentDao{
}
