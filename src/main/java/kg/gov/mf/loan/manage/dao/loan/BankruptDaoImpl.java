package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.Bankrupt;

@Repository("bankruptDao")
public class BankruptDaoImpl extends AbstractDao<Long, Bankrupt> implements BankruptDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Bankrupt> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Bankrupt> bs = (List<Bankrupt>) criteria.list();
		return bs;
	}

	@Override
	public Bankrupt findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(Bankrupt bankrupt) {
		persist(bankrupt);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Bankrupt b = (Bankrupt)crit.uniqueResult();
        delete(b);
	}

}
