package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

import java.util.Date;
import java.util.List;

public interface PaymentScheduleDao extends GenericDao<PaymentSchedule>{

    List<PaymentSchedule> getRowsUntilOnDateByLoanId(Long loanId, Date onDate);

}
