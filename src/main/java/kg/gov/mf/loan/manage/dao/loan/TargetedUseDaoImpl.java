package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.TargetedUse;

@Repository("targetedUseDao")
public class TargetedUseDaoImpl extends AbstractDao<Long, TargetedUse> implements TargetedUseDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<TargetedUse> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<TargetedUse> tus = (List<TargetedUse>) criteria.list();
		return tus;
	}

	@Override
	public TargetedUse findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(TargetedUse tu) {
		persist(tu);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        TargetedUse tu = (TargetedUse)crit.uniqueResult();
        delete(tu);
	}

}
