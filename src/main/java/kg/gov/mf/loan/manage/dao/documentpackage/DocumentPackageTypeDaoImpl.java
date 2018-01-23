package kg.gov.mf.loan.manage.dao.documentpackage;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;

@Repository("documentPackageTypeDao")
public class DocumentPackageTypeDaoImpl extends GenericDaoImpl<DocumentPackageType> implements DocumentPackageTypeDao {
	@Override
	public DocumentPackageType getByName(String name) {
		return (DocumentPackageType) getCurrentSession().createQuery("from DocumentPackageType where name = '" + name + "'").uniqueResult();
	}
}