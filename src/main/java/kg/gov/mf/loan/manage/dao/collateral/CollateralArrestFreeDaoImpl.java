package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralArrestFree;

@Repository("collateralArrestFreeDao")
public class CollateralArrestFreeDaoImpl extends AbstractDao<Long, CollateralArrestFree> implements CollateralArrestFreeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralArrestFree> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralArrestFree> aFs = (List<CollateralArrestFree>) criteria.list();
		return aFs;
	}

	@Override
	public CollateralArrestFree findById(long id) {
		return getByKey(id);
	}

	@Override
	public CollateralArrestFree findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (CollateralArrestFree) crit.uniqueResult();
	}

	@Override
	public void save(CollateralArrestFree af) {
		persist(af);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralArrestFree af = (CollateralArrestFree)crit.uniqueResult();
        delete(af);
	}

}
