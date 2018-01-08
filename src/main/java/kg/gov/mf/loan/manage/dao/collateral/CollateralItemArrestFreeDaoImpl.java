package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemArrestFree;

@Repository("collateralItemArrestFreeDao")
public class CollateralItemArrestFreeDaoImpl extends AbstractDao<Long, CollateralItemArrestFree> implements CollateralItemArrestFreeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralItemArrestFree> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralItemArrestFree> iafs = (List<CollateralItemArrestFree>) criteria.list();
		return iafs;
	}

	@Override
	public CollateralItemArrestFree findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CollateralItemArrestFree iaf) {
		persist(iaf);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralItemArrestFree iaf = (CollateralItemArrestFree)crit.uniqueResult();
        delete(iaf);
	}

}
