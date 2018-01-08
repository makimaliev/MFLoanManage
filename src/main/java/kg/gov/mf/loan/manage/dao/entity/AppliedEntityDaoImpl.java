package kg.gov.mf.loan.manage.dao.entity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entity.AppliedEntity;

@Repository("appliedEntityDao")
public class AppliedEntityDaoImpl extends AbstractDao<Long, AppliedEntity> implements AppliedEntityDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AppliedEntity> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("listNumber"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<AppliedEntity> entities = (List<AppliedEntity>) criteria.list();
		return entities;
	}

	@Override
	public AppliedEntity findById(long id) {
		return getByKey(id);
	}

	@Override
	public AppliedEntity findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (AppliedEntity) crit.uniqueResult();
	}

	@Override
	public void save(AppliedEntity entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        AppliedEntity entity = (AppliedEntity)crit.uniqueResult();
        delete(entity);
	}

}
