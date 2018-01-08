package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.Bankrupt;

public interface BankruptService {

	Bankrupt findById(long id);
	void save(Bankrupt b);
	void update(Bankrupt b);
	void deleteById(long id);
	List<Bankrupt> findAll();
	
}
