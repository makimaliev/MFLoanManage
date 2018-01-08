package kg.gov.mf.loan.manage.dao.order;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.order.CreditOrderState;

@Repository("creditOrderStateDao")
public class CreditOrderStateDaoImpl extends AbstractDao<Long, CreditOrderState> implements CreditOrderStateDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditOrderState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CreditOrderState> states = (List<CreditOrderState>) criteria.list();
		return states;
	}
	@Override
	public CreditOrderState findById(long id) {
		return getByKey(id);
	}

	@Override
	public CreditOrderState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (CreditOrderState) crit.uniqueResult();
	}

	@Override
	public void save(CreditOrderState state) {
		persist(state);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CreditOrderState state = (CreditOrderState)crit.uniqueResult();
        delete(state);
	}

}
