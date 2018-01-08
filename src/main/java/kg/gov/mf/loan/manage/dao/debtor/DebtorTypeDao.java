package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.DebtorType;

public interface DebtorTypeDao {

	List<DebtorType> findAll();
	DebtorType findById(long id);
	DebtorType findByName(String name);
    void save(DebtorType type);
    void deleteById(long id);
	
}
