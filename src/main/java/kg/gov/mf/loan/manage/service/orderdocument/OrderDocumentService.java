package kg.gov.mf.loan.manage.service.orderdocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

public interface OrderDocumentService {

	OrderDocument findById(long id);
	OrderDocument findByName(String name);
	void save(OrderDocument doc);
	void update(OrderDocument doc);
	void deleteById(long id);
	List<OrderDocument> findAll();
	
}
