package kg.gov.mf.loan.manage.dao.order;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.order.CreditOrderType;

@Repository("creditOrderTypeDao")
public class CreditOrderTypeDaoImpl extends AbstractDao<Long, CreditOrderType> implements CreditOrderTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditOrderType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CreditOrderType> types = (List<CreditOrderType>) criteria.list();
		return types;
	}

	@Override
	public CreditOrderType findById(long id) {
		return getByKey(id);
	}

	@Override
	public CreditOrderType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (CreditOrderType) crit.uniqueResult();
	}

	@Override
	public void save(CreditOrderType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CreditOrderType type = (CreditOrderType)crit.uniqueResult();
        delete(type);
	}
}
