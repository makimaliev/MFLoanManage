package kg.gov.mf.loan.manage.service.orderdocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocumentType;

public interface OrderDocumentTypeService {
	
	OrderDocumentType findById(long id);
	OrderDocumentType findByName(String name);
	void save(OrderDocumentType type);
	void update(OrderDocumentType type);
	void deleteById(long id);
	List<OrderDocumentType> findAll(); 
	boolean isTypeNameUnique(long id, String name);

}
