package kg.gov.mf.loan.manage.service.documentpackage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("documentPackageService")
@Transactional
public class DocumentPackageServiceImpl extends GenericServiceImpl<DocumentPackage> implements DocumentPackageService{
}
