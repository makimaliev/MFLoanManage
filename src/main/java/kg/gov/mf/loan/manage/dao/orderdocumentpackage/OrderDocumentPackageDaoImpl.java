package kg.gov.mf.loan.manage.dao.orderdocumentpackage;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

@Repository("orderDocumentPackageDao")
public class OrderDocumentPackageDaoImpl extends AbstractDao<Long, OrderDocumentPackage> implements OrderDocumentPackageDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDocumentPackage> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderDocumentPackage> oDPs = (List<OrderDocumentPackage>) criteria.list();
		return oDPs;
	}

	@Override
	public OrderDocumentPackage findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderDocumentPackage findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderDocumentPackage) crit.uniqueResult();
	}

	@Override
	public void save(OrderDocumentPackage oDP) {
		persist(oDP);		
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderDocumentPackage oDP = (OrderDocumentPackage)crit.uniqueResult();
        delete(oDP);
	}

}
