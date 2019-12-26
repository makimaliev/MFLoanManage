package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.loan.LoanSummaryAct;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface LoanSummaryActService extends GenericService<LoanSummaryAct> {

    public List<LoanSummaryAct> getLoanSummaryActByDebtor(Debtor debtor);
    public boolean isUneque(String reg_number);
}
