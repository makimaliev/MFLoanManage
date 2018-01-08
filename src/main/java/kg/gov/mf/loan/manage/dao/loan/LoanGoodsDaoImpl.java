package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.loan.LoanGoods;

@Repository("loanGoodsDao")
public class LoanGoodsDaoImpl extends AbstractDao<Long, LoanGoods> implements LoanGoodsDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanGoods> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<LoanGoods> lgs = (List<LoanGoods>) criteria.list();
		return lgs;
	}

	@Override
	public LoanGoods findById(long id) {
		return getByKey(id);
	}

	@Override
	public void save(LoanGoods lg) {
		persist(lg);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        LoanGoods lg = (LoanGoods)crit.uniqueResult();
        delete(lg);
	}

}
