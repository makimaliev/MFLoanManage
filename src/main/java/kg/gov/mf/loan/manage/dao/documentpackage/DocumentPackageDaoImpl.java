package kg.gov.mf.loan.manage.dao.documentpackage;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

@Repository("documentPackageDao")
public class DocumentPackageDaoImpl extends GenericDaoImpl<DocumentPackage> implements DocumentPackageDao{
}
