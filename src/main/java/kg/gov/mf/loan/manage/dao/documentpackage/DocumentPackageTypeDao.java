package kg.gov.mf.loan.manage.dao.documentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;

public interface DocumentPackageTypeDao {
	
	List<DocumentPackageType> findAll();
	DocumentPackageType findById(long id);
	DocumentPackageType findByName(String name);
    void save(DocumentPackageType type);
    void deleteById(long id);

}
