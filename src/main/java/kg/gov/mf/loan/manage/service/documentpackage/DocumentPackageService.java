package kg.gov.mf.loan.manage.service.documentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

public interface DocumentPackageService {
	
	DocumentPackage findById(long id);
	DocumentPackage findByName(String name);
	List<DocumentPackage> findByOrderDocumentPackageId(long id);
	void save(DocumentPackage dp);
	void update(DocumentPackage dp);
	void deleteById(long id);
	List<DocumentPackage> findAll();

}
