package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Repository("loanDao")
public class LoanDaoImpl extends GenericDaoImpl<Loan> implements LoanDao{
}
