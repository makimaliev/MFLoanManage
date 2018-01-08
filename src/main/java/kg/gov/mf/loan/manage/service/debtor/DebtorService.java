package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.Debtor;

public interface DebtorService {

	Debtor findById(long id);
	Debtor findByName(String name);
	void save(Debtor debtor);
	void update(Debtor debtor);
	void deleteById(long id);
	List<Debtor> findAll();
	
}
