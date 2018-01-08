package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.ReconstructedList;

@Repository("reconstructedListDao")
public class ReconstructedListDaoImpl extends AbstractDao<Long, ReconstructedList> implements ReconstructedListDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<ReconstructedList> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<ReconstructedList> rls = (List<ReconstructedList>) criteria.list();
		return rls;
	}

	@Override
	public ReconstructedList findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(ReconstructedList rl) {
		persist(rl);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        ReconstructedList rl = (ReconstructedList)crit.uniqueResult();
        delete(rl);
	}

}
