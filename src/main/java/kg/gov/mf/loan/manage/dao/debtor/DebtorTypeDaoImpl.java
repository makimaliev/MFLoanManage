package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.debtor.DebtorType;

@Repository("debtorTypeDao")
public class DebtorTypeDaoImpl extends AbstractDao<Long, DebtorType> implements DebtorTypeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<DebtorType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<DebtorType> types = (List<DebtorType>) criteria.list();
		return types;
	}

	@Override
	public DebtorType findById(long id) {
		return getByKey(id);
	}

	@Override
	public DebtorType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (DebtorType) crit.uniqueResult();
	}

	@Override
	public void save(DebtorType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        DebtorType type = (DebtorType)crit.uniqueResult();
        delete(type);
	}

}
