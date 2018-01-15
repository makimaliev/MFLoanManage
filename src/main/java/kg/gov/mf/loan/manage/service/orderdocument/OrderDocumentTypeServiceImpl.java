package kg.gov.mf.loan.manage.service.orderdocument;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocumentType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderDocumentTypeService")
@Transactional
public class OrderDocumentTypeServiceImpl extends GenericServiceImpl<OrderDocumentType> implements OrderDocumentTypeService{
}
