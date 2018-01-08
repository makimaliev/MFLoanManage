package kg.gov.mf.loan.manage.dao.orderdocument;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocumentType;

public interface OrderDocumentTypeDao {
	
	List<OrderDocumentType> findAll();
	OrderDocumentType findById(long id);
	OrderDocumentType findByName(String name);
    void save(OrderDocumentType type);
    void deleteById(long id);

}
