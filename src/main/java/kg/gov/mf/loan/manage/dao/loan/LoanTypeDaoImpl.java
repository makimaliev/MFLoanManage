package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.LoanType;

@Repository("loanTypeDao")
public class LoanTypeDaoImpl extends AbstractDao<Long, LoanType> implements LoanTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanType> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<LoanType> types = (List<LoanType>) criteria.list();
		return types;
	}

	@Override
	public LoanType findById(long id) {
		return getByKey(id);
	}

	@Override
	public LoanType findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (LoanType) crit.uniqueResult();
	}

	@Override
	public void save(LoanType type) {
		persist(type);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        LoanType type = (LoanType)crit.uniqueResult();
        delete(type);
	}

}
