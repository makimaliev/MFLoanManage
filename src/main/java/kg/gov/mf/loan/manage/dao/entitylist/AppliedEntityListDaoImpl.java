package kg.gov.mf.loan.manage.dao.entitylist;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

@Repository("appliedEntityListDao")
public class AppliedEntityListDaoImpl extends AbstractDao<Long, AppliedEntityList> implements AppliedEntityListDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AppliedEntityList> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("listNumber"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<AppliedEntityList> lists = (List<AppliedEntityList>) criteria.list();
		return lists;
	}

	@Override
	public AppliedEntityList findById(long id) {
		return getByKey(id);
	}

	@Override
	public AppliedEntityList findByListNumber(String listNumber) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("listNumber", listNumber));
        return (AppliedEntityList) crit.uniqueResult();
	}

	@Override
	public void save(AppliedEntityList list) {
		persist(list);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        AppliedEntityList list = (AppliedEntityList)crit.uniqueResult();
        delete(list);
	}

}
