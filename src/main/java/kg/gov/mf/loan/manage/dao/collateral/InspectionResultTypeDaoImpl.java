package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.InspectionResultType;

@Repository("inspectionResultTypeDao")
public class InspectionResultTypeDaoImpl extends AbstractDao<Long, InspectionResultType> implements InspectionResultTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<InspectionResultType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<InspectionResultType> types = (List<InspectionResultType>) criteria.list();
		return types;
	}

	@Override
	public InspectionResultType findById(long id) {
		return getByKey(id);
	}

	@Override
	public InspectionResultType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (InspectionResultType) crit.uniqueResult();
	}

	@Override
	public void save(InspectionResultType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        InspectionResultType type = (InspectionResultType)crit.uniqueResult();
        delete(type);
	}

}
