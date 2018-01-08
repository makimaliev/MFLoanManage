package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.LoanState;

public interface LoanStateDao {

	List<LoanState> findAll();
	LoanState findById(long id);
	LoanState findByName(String name);
    void save(LoanState state);
    void deleteById(long id);
	
}
