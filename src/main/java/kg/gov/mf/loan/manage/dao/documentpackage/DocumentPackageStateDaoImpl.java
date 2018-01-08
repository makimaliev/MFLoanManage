package kg.gov.mf.loan.manage.dao.documentpackage;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;

@Repository("documentPackageStateDao")
public class DocumentPackageStateDaoImpl extends AbstractDao<Long, DocumentPackageState> implements DocumentPackageStateDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentPackageState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<DocumentPackageState> states = (List<DocumentPackageState>) criteria.list();
		return states;
	}

	@Override
	public DocumentPackageState findById(long id) {
		return getByKey(id);
	}

	@Override
	public DocumentPackageState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (DocumentPackageState) crit.uniqueResult();
	}

	@Override
	public void save(DocumentPackageState state) {
		persist(state);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        DocumentPackageState state = (DocumentPackageState)crit.uniqueResult();
        delete(state);
	}

}
