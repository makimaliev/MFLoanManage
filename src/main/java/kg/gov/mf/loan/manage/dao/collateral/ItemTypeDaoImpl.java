package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.ItemType;

@Repository("itemTypeDao")
public class ItemTypeDaoImpl extends AbstractDao<Long, ItemType> implements ItemTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<ItemType> types = (List<ItemType>) criteria.list();
		return types;
	}

	@Override
	public ItemType findById(long id) {
		return getByKey(id);
	}

	@Override
	public ItemType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (ItemType) crit.uniqueResult();
	}

	@Override
	public void save(ItemType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        ItemType type = (ItemType)crit.uniqueResult();
        delete(type);
	}

}
