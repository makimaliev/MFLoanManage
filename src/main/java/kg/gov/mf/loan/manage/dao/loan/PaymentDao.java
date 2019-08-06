package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.loan.Payment;

import java.util.Date;
import java.util.List;

public interface PaymentDao extends GenericDao<Payment> {

    List<Payment> getRowDayBeforeOnDateByLoanId(Long loanId, Date onDate);
    List<Payment> getRowsUntilOnDateByLoanId(Long loanId, Date onDate);
    List<Payment> getFromToDate(Long loanId,Date startDate,Date closeDate);
    String getPaymentDateAmountNumberById(Long paymentId);
}
