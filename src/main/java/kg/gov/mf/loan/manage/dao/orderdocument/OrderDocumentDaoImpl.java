package kg.gov.mf.loan.manage.dao.orderdocument;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

@Repository("orderDocumentDao")
public class OrderDocumentDaoImpl extends GenericDaoImpl<OrderDocument> implements OrderDocumentDao{
}
