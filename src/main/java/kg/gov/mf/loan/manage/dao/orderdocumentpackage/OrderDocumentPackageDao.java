package kg.gov.mf.loan.manage.dao.orderdocumentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

public interface OrderDocumentPackageDao {

	List<OrderDocumentPackage> findAll();
	OrderDocumentPackage findById(long id);
	OrderDocumentPackage findByName(String name);
    void save(OrderDocumentPackage oDP);
    void deleteById(long id);
	
}
