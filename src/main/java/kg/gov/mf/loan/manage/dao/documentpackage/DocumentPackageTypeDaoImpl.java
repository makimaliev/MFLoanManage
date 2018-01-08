package kg.gov.mf.loan.manage.dao.documentpackage;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;

@Repository("documentPackageTypeDao")
public class DocumentPackageTypeDaoImpl extends AbstractDao<Long, DocumentPackageType> implements DocumentPackageTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentPackageType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<DocumentPackageType> types = (List<DocumentPackageType>) criteria.list();
		return types;
	}

	@Override
	public DocumentPackageType findById(long id) {
		return getByKey(id);
	}

	@Override
	public DocumentPackageType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (DocumentPackageType) crit.uniqueResult();
	}

	@Override
	public void save(DocumentPackageType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        DocumentPackageType type = (DocumentPackageType)crit.uniqueResult();
        delete(type);
	}

}
