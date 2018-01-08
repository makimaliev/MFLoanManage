package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.Bankrupt;

public interface BankruptDao {

	List<Bankrupt> findAll();
	Bankrupt findById(long id);
    void save(Bankrupt bankrupt);
    void deleteById(long id);
	
}
