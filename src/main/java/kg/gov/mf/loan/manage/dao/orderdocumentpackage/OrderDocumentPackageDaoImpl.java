package kg.gov.mf.loan.manage.dao.orderdocumentpackage;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

@Repository("orderDocumentPackageDao")
public class OrderDocumentPackageDaoImpl extends GenericDaoImpl<OrderDocumentPackage> implements OrderDocumentPackageDao{

    @Override
    public OrderDocumentPackage getById(Long id)
    {
        OrderDocumentPackage result = super.getById(id);
        Hibernate.initialize(result.getOrderDocuments());
        return result;
    }
}
