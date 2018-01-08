package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.CreditTerm;

public interface CreditTermDao {

	List<CreditTerm> findAll();
	CreditTerm findById(long id);
    void save(CreditTerm term);
    void deleteById(long id);
	
}
