package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.LoanState;

@Repository("loanStateDao")
public class LoanStateDaoImpl extends AbstractDao<Long, LoanState> implements LoanStateDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<LoanState> states = (List<LoanState>) criteria.list();
		return states;
	}

	@Override
	public LoanState findById(long id) {
		return getByKey(id);
	}

	@Override
	public LoanState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (LoanState) crit.uniqueResult();
	}

	@Override
	public void save(LoanState state) {
		persist(state);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        LoanState state = (LoanState)crit.uniqueResult();
        delete(state);
	}

}
