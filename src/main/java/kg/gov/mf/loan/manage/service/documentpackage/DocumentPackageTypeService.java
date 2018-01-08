package kg.gov.mf.loan.manage.service.documentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;

public interface DocumentPackageTypeService {
	
	DocumentPackageType findById(long id);
	DocumentPackageType findByName(String name);
	void save(DocumentPackageType type);
	void update(DocumentPackageType type);
	void deleteById(long id);
	List<DocumentPackageType> findAll(); 
	boolean isTypeNameUnique(long id, String name);

}
