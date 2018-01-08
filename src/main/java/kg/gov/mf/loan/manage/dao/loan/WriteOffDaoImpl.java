package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.WriteOff;

@Repository("writeOffDao")
public class WriteOffDaoImpl extends AbstractDao<Long, WriteOff> implements WriteOffDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<WriteOff> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<WriteOff> writeOffs = (List<WriteOff>) criteria.list();
		return writeOffs;
	}

	@Override
	public WriteOff findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(WriteOff writeOff) {
		persist(writeOff);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        WriteOff writeOff = (WriteOff)crit.uniqueResult();
        delete(writeOff);
	}

}
