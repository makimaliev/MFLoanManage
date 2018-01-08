package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.Loan;

public interface LoanService {

	Loan findById(long id);
	Loan findByRegNumber(String regNumber);
	void save(Loan loan);
	void update(Loan loan);
	void deleteById(long id);
	List<Loan> findAll();
	
}
