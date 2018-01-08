package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.LoanState;

public interface LoanStateService {

	LoanState findById(long id);
	LoanState findByName(String name);
	void save(LoanState state);
	void update(LoanState state);
	void deleteById(long id);
	List<LoanState> findAll();
	
}
