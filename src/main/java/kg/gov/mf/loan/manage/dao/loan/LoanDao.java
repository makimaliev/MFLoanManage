package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.Loan;

public interface LoanDao {

	List<Loan> findAll();
	Loan findById(long id);
	Loan findByRegNumber(String regNumber);
    void save(Loan loan);
    void deleteById(long id);
	
}
