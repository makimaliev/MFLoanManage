package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

@Repository("creditTermDao")
public class CreditTermDaoImpl extends AbstractDao<Long, CreditTerm> implements CreditTermDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditTerm> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CreditTerm> terms = (List<CreditTerm>) criteria.list();
		return terms;
	}

	@Override
	public CreditTerm findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(CreditTerm term) {
		persist(term);
		
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CreditTerm term = (CreditTerm)crit.uniqueResult();
        delete(term);
	}

}
