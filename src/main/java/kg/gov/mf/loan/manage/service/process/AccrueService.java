package kg.gov.mf.loan.manage.service.process;

import kg.gov.mf.loan.manage.service.GenericService;
import kg.gov.mf.loan.manage.model.process.Accrue;

import java.util.Date;

public interface AccrueService extends GenericService<Accrue> {
    Accrue getByOnDateAndLoanId(Date onDate, long loanId);
}
