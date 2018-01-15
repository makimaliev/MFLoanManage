package kg.gov.mf.loan.manage.service.documentpackage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("documentPackageTypeService")
@Transactional
public class DocumentPackageTypeServiceImpl extends GenericServiceImpl<DocumentPackageType> implements DocumentPackageTypeService{
}
