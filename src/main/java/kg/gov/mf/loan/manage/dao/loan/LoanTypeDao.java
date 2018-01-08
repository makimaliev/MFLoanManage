package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.LoanType;

public interface LoanTypeDao {

	List<LoanType> findAll();
	LoanType findById(long id);
	LoanType findByName(String name);
    void save(LoanType type);
    void deleteById(long id);
	
}
