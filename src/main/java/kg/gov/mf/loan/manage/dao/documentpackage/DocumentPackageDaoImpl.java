package kg.gov.mf.loan.manage.dao.documentpackage;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

@Repository("documentPackageDao")
public class DocumentPackageDaoImpl extends GenericDaoImpl<DocumentPackage> implements DocumentPackageDao{

    @Override
    public DocumentPackage getById(Long id)
    {
        DocumentPackage result = super.getById(id);
        Hibernate.initialize(result.getEntityDocuments());
        return result;
    }

}
