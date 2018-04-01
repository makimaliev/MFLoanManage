package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.Date;
import java.util.List;

public interface PaymentScheduleService extends GenericService<PaymentSchedule> {

    List<PaymentSchedule> getRowsUntilOnDateByLoanId(Long loanId, Date onDate);

}
