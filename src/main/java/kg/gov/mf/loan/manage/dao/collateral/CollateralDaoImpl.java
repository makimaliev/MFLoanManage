package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.Collateral;

@Repository("collateralDao")
public class CollateralDaoImpl extends AbstractDao<Long, Collateral> implements CollateralDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Collateral> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Collateral> collaterals = (List<Collateral>) criteria.list();
		return collaterals;
	}

	@Override
	public Collateral findById(long id) {
		return getByKey(id);
	}

	@Override
	public Collateral findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (Collateral) crit.uniqueResult();
	}

	@Override
	public void save(Collateral collateral) {
		persist(collateral);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Collateral collateral = (Collateral)crit.uniqueResult();
        delete(collateral);
	}

}
