package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.manage.service.GenericService;

public interface LoanService extends GenericService<Loan>{

    public Loan getByVersion(Long version);
}
