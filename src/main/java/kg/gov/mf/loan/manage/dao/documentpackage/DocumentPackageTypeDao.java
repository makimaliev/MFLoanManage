package kg.gov.mf.loan.manage.dao.documentpackage;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;

public interface DocumentPackageTypeDao extends GenericDao<DocumentPackageType> {
	DocumentPackageType getByName(String name);
}
