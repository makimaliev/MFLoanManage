package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.Collection;

@Repository("collectionDao")
public class CollectionDaoImpl extends AbstractDao<Long, Collection> implements CollectionDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Collection> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Collection> colls = (List<Collection>) criteria.list();
		return colls;
	}

	@Override
	public Collection findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(Collection collection) {
		persist(collection);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Collection coll = (Collection)crit.uniqueResult();
        delete(coll);
	}

}
