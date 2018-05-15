package kg.gov.mf.loan.manage.dao.documentpackage;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;

public interface DocumentPackageStateDao extends GenericDao<DocumentPackageState>{
	DocumentPackageState getByName(String name);
}
