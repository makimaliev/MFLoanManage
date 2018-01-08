package kg.gov.mf.loan.manage.service.orderdocumentpackage;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

public interface OrderDocumentPackageService {

	OrderDocumentPackage findById(long id);
	OrderDocumentPackage findByName(String name);
	void save(OrderDocumentPackage oDP);
	void update(OrderDocumentPackage oDP);
	void deleteById(long id);
	List<OrderDocumentPackage> findAll();
}
