package kg.gov.mf.loan.manage.dao.entitydocument;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentState;

@Repository("entityDocumentStateDao")
public class EntityDocumentStateDaoImpl extends AbstractDao<Long, EntityDocumentState> implements EntityDocumentStateDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<EntityDocumentState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<EntityDocumentState> states = (List<EntityDocumentState>) criteria.list();
		return states;
	}

	@Override
	public EntityDocumentState findById(long id) {
		return getByKey(id);
	}

	@Override
	public EntityDocumentState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (EntityDocumentState) crit.uniqueResult();
	}

	@Override
	public void save(EntityDocumentState state) {
		persist(state);
		
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        EntityDocumentState state = (EntityDocumentState)crit.uniqueResult();
        delete(state);
	}

}
