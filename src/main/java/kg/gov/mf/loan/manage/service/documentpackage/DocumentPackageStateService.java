package kg.gov.mf.loan.manage.service.documentpackage;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;
import kg.gov.mf.loan.manage.service.GenericService;

public interface DocumentPackageStateService extends GenericService<DocumentPackageState>{
	DocumentPackageState getByName(String name);
}
