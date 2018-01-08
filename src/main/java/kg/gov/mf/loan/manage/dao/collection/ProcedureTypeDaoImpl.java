package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.ProcedureType;

@Repository("procedureTypeDao")
public class ProcedureTypeDaoImpl extends AbstractDao<Long, ProcedureType> implements ProcedureTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<ProcedureType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<ProcedureType> entities = (List<ProcedureType>) criteria.list();
		return entities;
	}

	@Override
	public ProcedureType findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(ProcedureType entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        ProcedureType entity = (ProcedureType)crit.uniqueResult();
        delete(entity);
	}

}
