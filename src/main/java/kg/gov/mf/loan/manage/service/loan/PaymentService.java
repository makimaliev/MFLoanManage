package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.Payment;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.Date;
import java.util.List;

public interface PaymentService extends GenericService<Payment> {

    Payment getRowDayBeforeOnDate(Date onDate);
    List<Payment> getRowsUntilOnDate(Date onDate);

}
