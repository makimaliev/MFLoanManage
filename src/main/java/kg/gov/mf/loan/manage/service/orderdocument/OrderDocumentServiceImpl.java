package kg.gov.mf.loan.manage.service.orderdocument;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderDocumentService")
@Transactional
public class OrderDocumentServiceImpl extends GenericServiceImpl<OrderDocument> implements OrderDocumentService{
}
