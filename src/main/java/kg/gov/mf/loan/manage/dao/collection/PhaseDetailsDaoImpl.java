package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collection.PhaseDetails;

@Repository("phaseDetailsDao")
public class PhaseDetailsDaoImpl extends AbstractDao<Long, PhaseDetails> implements PhaseDetailsDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<PhaseDetails> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<PhaseDetails> entities = (List<PhaseDetails>) criteria.list();
		return entities;
	}

	@Override
	public PhaseDetails findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(PhaseDetails entity) {
		persist(entity);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        PhaseDetails entity = (PhaseDetails)crit.uniqueResult();
        delete(entity);
	}

}
