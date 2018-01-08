package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralSummary;

@Repository("collateralSummaryDao")
public class CollateralSummaryDaoImpl extends AbstractDao<Long, CollateralSummary> implements CollateralSummaryDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralSummary> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralSummary> summaries = (List<CollateralSummary>) criteria.list();
		return summaries;
	}

	@Override
	public CollateralSummary findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollateralSummary summary) {
		persist(summary);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralSummary summary = (CollateralSummary)crit.uniqueResult();
        delete(summary);
	}

}
