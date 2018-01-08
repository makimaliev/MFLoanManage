package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.ProcedureStatus;

@Repository("procedureStatusDao")
public class ProcedureStatusDaoImpl extends AbstractDao<Long, ProcedureStatus> implements ProcedureStatusDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<ProcedureStatus> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<ProcedureStatus> entities = (List<ProcedureStatus>) criteria.list();
		return entities;
	}

	@Override
	public ProcedureStatus findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(ProcedureStatus entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        ProcedureStatus entity = (ProcedureStatus)crit.uniqueResult();
        delete(entity);
	}

}
