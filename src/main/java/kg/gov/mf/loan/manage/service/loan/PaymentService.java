package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.Payment;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.Date;
import java.util.List;

public interface PaymentService extends GenericService<Payment> {

    List<Payment> getRowDayBeforeOnDateByLoanId(Long loanId, Date onDate);
    List<Payment> getRowsUntilOnDateByLoanId(Long loanId, Date onDate);
    List<Payment> getFromToDate(Long loanId,Date startDate,Date closeDate);

    String getPaymentDateAmountNumberById(Long paymentId);

}
