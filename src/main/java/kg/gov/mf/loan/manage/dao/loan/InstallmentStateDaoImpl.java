package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.InstallmentState;

@Repository("installmentStateDao")
public class InstallmentStateDaoImpl extends AbstractDao<Long, InstallmentState> implements InstallmentStateDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<InstallmentState> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<InstallmentState> states = (List<InstallmentState>) criteria.list();
		return states;
	}

	@Override
	public InstallmentState findById(long id) {
		return getByKey(id);
	}

	@Override
	public InstallmentState findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (InstallmentState) crit.uniqueResult();
	}

	@Override
	public void save(InstallmentState state) {
		persist(state);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        InstallmentState state = (InstallmentState)crit.uniqueResult();
        delete(state);
	}

}
