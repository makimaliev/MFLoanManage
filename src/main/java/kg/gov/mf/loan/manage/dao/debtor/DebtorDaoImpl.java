package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.debtor.Debtor;

@Repository("debtorDao")
public class DebtorDaoImpl extends AbstractDao<Long, Debtor> implements DebtorDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Debtor> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Debtor> debtors = (List<Debtor>) criteria.list();
		return debtors;
	}

	@Override
	public Debtor findById(long id) {
		return getByKey(id);
	}

	@Override
	public Debtor findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (Debtor) crit.uniqueResult();
	}

	@Override
	public void save(Debtor debtor) {
		persist(debtor);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Debtor debtor = (Debtor)crit.uniqueResult();
        delete(debtor);
	}

}
