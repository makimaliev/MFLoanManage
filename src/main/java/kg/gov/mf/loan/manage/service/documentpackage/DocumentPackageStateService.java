package kg.gov.mf.loan.manage.service.documentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;

public interface DocumentPackageStateService {

	DocumentPackageState findById(long id);
	DocumentPackageState findByName(String name);
	void save(DocumentPackageState state);
	void update(DocumentPackageState state);
	void deleteById(long id);
	List<DocumentPackageState> findAll(); 
	boolean isStateNameUnique(long id, String name);
	
}
