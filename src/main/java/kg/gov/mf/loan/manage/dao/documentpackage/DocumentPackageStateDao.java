package kg.gov.mf.loan.manage.dao.documentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;

public interface DocumentPackageStateDao {
	
	List<DocumentPackageState> findAll();
	DocumentPackageState findById(long id);
	DocumentPackageState findByName(String name);
    void save(DocumentPackageState state);
    void deleteById(long id);

}
