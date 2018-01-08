package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemDetails;

@Repository("collateralItemDetailsDao")
public class CollateralItemDetailsDaoImpl extends AbstractDao<Long, CollateralItemDetails> implements CollateralItemDetailsDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralItemDetails> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralItemDetails> details = (List<CollateralItemDetails>) criteria.list();
		return details;
	}

	@Override
	public CollateralItemDetails findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollateralItemDetails details) {
		persist(details);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralItemDetails details = (CollateralItemDetails)crit.uniqueResult();
        delete(details);
	}

}
