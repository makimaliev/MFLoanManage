package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Repository("loanDao")
public class LoanDaoImpl extends AbstractDao<Long, Loan> implements LoanDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Loan> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Loan> loans = (List<Loan>) criteria.list();
		return loans;
	}

	@Override
	public Loan findById(long id) {
		return getByKey(id);
	}

	@Override
	public Loan findByRegNumber(String regNumber) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("regNumber", regNumber));
        return (Loan) crit.uniqueResult();
	}

	@Override
	public void save(Loan loan) {
		persist(loan);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Loan loan = (Loan)crit.uniqueResult();
        delete(loan);
	}
	
}
