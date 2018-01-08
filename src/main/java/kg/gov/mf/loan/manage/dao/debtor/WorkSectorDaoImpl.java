package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.debtor.WorkSector;

@Repository("workSectorDao")
public class WorkSectorDaoImpl extends AbstractDao<Long, WorkSector> implements WorkSectorDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<WorkSector> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<WorkSector> sectors = (List<WorkSector>) criteria.list();
		return sectors;
	}

	@Override
	public WorkSector findById(long id) {
		return getByKey(id);
	}

	@Override
	public WorkSector findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (WorkSector) crit.uniqueResult();
	}

	@Override
	public void save(WorkSector sector) {
		persist(sector);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        WorkSector sector = (WorkSector)crit.uniqueResult();
        delete(sector);
	}

}
