package kg.gov.mf.loan.manage.dao.entitydocument;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;

@Repository("entityDocumentDao")
public class EntityDocumentDaoImpl extends AbstractDao<Long, EntityDocument> implements EntityDocumentDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<EntityDocument> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<EntityDocument> docs = (List<EntityDocument>) criteria.list();
		return docs;
	}

	@Override
	public EntityDocument findById(long id) {
		return getByKey(id);
	}
	
	@Override
	public EntityDocument findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (EntityDocument) crit.uniqueResult();
	}

	@Override
	public EntityDocument findByRegNumber(String rNumber) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("registeredNumber", rNumber));
        return (EntityDocument) crit.uniqueResult();
	}

	@Override
	public void save(EntityDocument document) {
		persist(document);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        EntityDocument document = (EntityDocument)crit.uniqueResult();
        delete(document);
	}
}
