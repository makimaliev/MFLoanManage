package kg.gov.mf.loan.manage.dao.orderdocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

public interface OrderDocumentDao {
	
	List<OrderDocument> findAll();
	OrderDocument findById(long id);
	OrderDocument findName(String name);
    void save(OrderDocument document);
    void deleteById(long id);

}
