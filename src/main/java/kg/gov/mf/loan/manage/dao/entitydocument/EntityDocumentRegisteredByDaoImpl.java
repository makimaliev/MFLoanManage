package kg.gov.mf.loan.manage.dao.entitydocument;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;

@Repository("entityDocumentRegisteredByDao")
public class EntityDocumentRegisteredByDaoImpl extends AbstractDao<Long, EntityDocumentRegisteredBy> implements EntityDocumentRegisteredByDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<EntityDocumentRegisteredBy> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<EntityDocumentRegisteredBy> rBs = (List<EntityDocumentRegisteredBy>) criteria.list();
		return rBs;
	}

	@Override
	public EntityDocumentRegisteredBy findById(long id) {
		return getByKey(id);
	}

	@Override
	public EntityDocumentRegisteredBy findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (EntityDocumentRegisteredBy) crit.uniqueResult();
	}

	@Override
	public void save(EntityDocumentRegisteredBy rb) {
		persist(rb);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        EntityDocumentRegisteredBy rb = (EntityDocumentRegisteredBy)crit.uniqueResult();
        delete(rb);
	}

}
