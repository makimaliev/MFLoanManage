package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.DebtTransfer;

@Repository("debtTransferDao")
public class DebtTransferDaoImpl extends AbstractDao<Long, DebtTransfer> implements DebtTransferDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<DebtTransfer> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<DebtTransfer> dts = (List<DebtTransfer>) criteria.list();
		return dts;
	}

	@Override
	public DebtTransfer findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(DebtTransfer dt) {
		persist(dt);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        DebtTransfer dt = (DebtTransfer)crit.uniqueResult();
        delete(dt);
	}

}
