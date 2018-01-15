package kg.gov.mf.loan.manage.service.orderdocumentpackage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderDocumentPackageService")
@Transactional
public class OrderDocumentPackageServiceImpl extends GenericServiceImpl<OrderDocumentPackage> implements OrderDocumentPackageService{
}
