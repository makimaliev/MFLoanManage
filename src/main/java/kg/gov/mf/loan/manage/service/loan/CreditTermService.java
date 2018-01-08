package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.CreditTerm;

public interface CreditTermService {

	CreditTerm findById(long id);
	void save(CreditTerm term);
	void update(CreditTerm term);
	void deleteById(long id);
	List<CreditTerm> findAll();
	
}
