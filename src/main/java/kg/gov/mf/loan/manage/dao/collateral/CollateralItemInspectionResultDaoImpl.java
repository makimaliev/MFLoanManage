package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemInspectionResult;

@Repository("collateralItemInspectionResultDao")
public class CollateralItemInspectionResultDaoImpl extends AbstractDao<Long, CollateralItemInspectionResult> implements CollateralItemInspectionResultDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralItemInspectionResult> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralItemInspectionResult> results = (List<CollateralItemInspectionResult>) criteria.list();
		return results;
	}

	@Override
	public CollateralItemInspectionResult findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollateralItemInspectionResult result) {
		persist(result);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralItemInspectionResult result = (CollateralItemInspectionResult)crit.uniqueResult();
        delete(result);
	}

}
