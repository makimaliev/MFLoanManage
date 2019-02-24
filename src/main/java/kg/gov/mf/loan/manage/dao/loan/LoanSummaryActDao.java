package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.loan.LoanSummaryAct;
import kg.gov.mf.loan.manage.util.DateUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.Date;
import java.util.List;

public interface LoanSummaryActDao extends GenericDao<LoanSummaryAct> {

    public List<LoanSummaryAct> getLoanSummaryActByDebtor(Debtor debtor);
}
