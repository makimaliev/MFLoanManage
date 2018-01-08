package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.QuantityType;

@Repository("quantityTypeDao")
public class QuantityTypeDaoImpl extends AbstractDao<Long, QuantityType> implements QuantityTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<QuantityType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<QuantityType> types = (List<QuantityType>) criteria.list();
		return types;
	}

	@Override
	public QuantityType findById(long id) {
		return getByKey(id);
	}

	@Override
	public QuantityType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (QuantityType) crit.uniqueResult();
	}

	@Override
	public void save(QuantityType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        QuantityType type = (QuantityType)crit.uniqueResult();
        delete(type);
	}

}
