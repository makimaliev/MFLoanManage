package kg.gov.mf.loan.manage.dao.orderdocument;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

@Repository("orderDocumentDao")
public class OrderDocumentDaoImpl extends AbstractDao<Long, OrderDocument> implements OrderDocumentDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDocument> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrderDocument> docs = (List<OrderDocument>) criteria.list();
		return docs;
	}

	@Override
	public OrderDocument findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrderDocument findName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrderDocument) crit.uniqueResult();
	}

	@Override
	public void save(OrderDocument document) {
		persist(document);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrderDocument document = (OrderDocument)crit.uniqueResult();
        delete(document);
	}

}
