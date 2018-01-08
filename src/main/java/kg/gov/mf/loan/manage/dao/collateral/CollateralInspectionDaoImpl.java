package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralInspection;

@Repository("collateralInspectionDao")
public class CollateralInspectionDaoImpl extends AbstractDao<Long, CollateralInspection> implements CollateralInspectionDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralInspection> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralInspection> inspections = (List<CollateralInspection>) criteria.list();
		return inspections;
	}

	@Override
	public CollateralInspection findById(long id) {
		return getByKey(id);
	}

	@Override
	public CollateralInspection findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (CollateralInspection) crit.uniqueResult();
	}

	@Override
	public void save(CollateralInspection inspection) {
		persist(inspection);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralInspection inspection = (CollateralInspection)crit.uniqueResult();
        delete(inspection);
	}

}
