package kg.gov.mf.loan.manage.service.documentpackage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("documentPackageStateService")
@Transactional
public class DocumentPackageStateServiceImpl extends GenericServiceImpl<DocumentPackageState> implements DocumentPackageStateService{
}
