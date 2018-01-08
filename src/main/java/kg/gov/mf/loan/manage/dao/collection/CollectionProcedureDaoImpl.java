package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.CollectionProcedure;

@Repository("collectionProcedureDao")
public class CollectionProcedureDaoImpl extends AbstractDao<Long, CollectionProcedure> implements CollectionProcedureDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollectionProcedure> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollectionProcedure> ps = (List<CollectionProcedure>) criteria.list();
		return ps;
	}

	@Override
	public CollectionProcedure findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollectionProcedure procedure) {
		persist(procedure);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollectionProcedure p = (CollectionProcedure)crit.uniqueResult();
        delete(p);
	}

}
