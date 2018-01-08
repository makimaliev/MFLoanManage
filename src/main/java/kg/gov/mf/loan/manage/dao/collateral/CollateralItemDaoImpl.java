package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItem;

@Repository("collateralItemDao")
public class CollateralItemDaoImpl extends AbstractDao<Long, CollateralItem> implements CollateralItemDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralItem> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralItem> items = (List<CollateralItem>) criteria.list();
		return items;
	}

	@Override
	public CollateralItem findById(long id) {
		return getByKey(id);
	}

	@Override
	public CollateralItem findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (CollateralItem) crit.uniqueResult();
	}

	@Override
	public void save(CollateralItem item) {
		persist(item);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralItem item = (CollateralItem)crit.uniqueResult();
        delete(item);
	}

}
