package kg.gov.mf.loan.manage.dao.documentpackage;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

@Repository("documentPackageDao")
public class DocumentPackageDaoImpl extends AbstractDao<Long, DocumentPackage> implements DocumentPackageDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentPackage> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<DocumentPackage> packages = (List<DocumentPackage>) criteria.list();
		return packages;
	}

	@Override
	public DocumentPackage findById(long id) {
		return getByKey(id);
	}
	
	@Override
	public DocumentPackage findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (DocumentPackage) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentPackage> findByOrderDocumentPackageId(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("orderDocumentPackageId", id));
        List<DocumentPackage> packages = (List<DocumentPackage>) crit.list();
        return packages;
	}

	@Override
	public void save(DocumentPackage dp) {
		persist(dp);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        DocumentPackage dp = (DocumentPackage)crit.uniqueResult();
        delete(dp);
	}
}
