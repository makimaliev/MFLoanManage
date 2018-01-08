package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.DebtorType;

public interface DebtorTypeService {

	DebtorType findById(long id);
	DebtorType findByName(String name);
	void save(DebtorType type);
	void update(DebtorType type);
	void deleteById(long id);
	List<DebtorType> findAll(); 
	
}
