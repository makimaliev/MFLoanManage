package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.loan.Payment;

import java.util.Date;
import java.util.List;

public interface PaymentDao extends GenericDao<Payment> {

    Payment getRowDayBeforeOnDate(Date onDate);
    List<Payment> getRowsUntilOnDate(Date onDate);

}
