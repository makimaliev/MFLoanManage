package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.ConditionType;

@Repository("conditionTypeDao")
public class ConditionTypeDaoImpl extends AbstractDao<Long, ConditionType> implements ConditionTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<ConditionType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<ConditionType> types = (List<ConditionType>) criteria.list();
		return types;
	}

	@Override
	public ConditionType findById(long id) {
		return getByKey(id);
	}

	@Override
	public ConditionType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (ConditionType) crit.uniqueResult();
	}

	@Override
	public void save(ConditionType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        ConditionType type = (ConditionType)crit.uniqueResult();
        delete(type);
	}

}
