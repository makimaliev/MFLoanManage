package kg.gov.mf.loan.manage.dao.process;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.process.Accrue;

import java.util.Date;

public interface AccrueDao extends GenericDao<Accrue> {
    Accrue getByOnDateAndLoanId(Date onDate, long loanId);
}
