package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.LoanType;

public interface LoanTypeService {

	LoanType findById(long id);
	LoanType findByName(String name);
	void save(LoanType type);
	void update(LoanType type);
	void deleteById(long id);
	List<LoanType> findAll();
	
}
