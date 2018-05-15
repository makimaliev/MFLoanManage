package kg.gov.mf.loan.manage.dao.documentpackage;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;

@Repository("documentPackageStateDao")
public class DocumentPackageStateDaoImpl extends GenericDaoImpl<DocumentPackageState> implements DocumentPackageStateDao {

	@Override
	public DocumentPackageState getByName(String name) {
		return (DocumentPackageState) getCurrentSession().createQuery("from DocumentPackageState where name = '" + name + "'").uniqueResult();
	}
}
