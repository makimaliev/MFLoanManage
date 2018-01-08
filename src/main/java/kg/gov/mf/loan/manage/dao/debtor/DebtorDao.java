package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.Debtor;

public interface DebtorDao {
	
	List<Debtor> findAll();
	Debtor findById(long id);
	Debtor findByName(String name);
    void save(Debtor debtor);
    void deleteById(long id);

}
