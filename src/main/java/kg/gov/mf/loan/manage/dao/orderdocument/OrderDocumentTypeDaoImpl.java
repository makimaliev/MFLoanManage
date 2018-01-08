package kg.gov.mf.loan.manage.dao.orderdocument;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocumentType;

@Repository("orderDocumentTypeDao")
public class OrderDocumentTypeDaoImpl extends AbstractDao<Long, OrderDocumentType> implements OrderDocumentTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDocumentType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderDocumentType> types = (List<OrderDocumentType>) criteria.list();
		return types;
	}

	@Override
	public OrderDocumentType findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderDocumentType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderDocumentType) crit.uniqueResult();
	}

	@Override
	public void save(OrderDocumentType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderDocumentType type = (OrderDocumentType)crit.uniqueResult();
        delete(type);
	}

}
