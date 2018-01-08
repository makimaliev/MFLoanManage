package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;

@Repository("collateralAgreementDao")
public class CollateralAgreementDaoImpl extends AbstractDao<Long, CollateralAgreement> implements CollateralAgreementDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CollateralAgreement> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<CollateralAgreement> agreements = (List<CollateralAgreement>) criteria.list();
		return agreements;
	}

	@Override
	public CollateralAgreement findById(long id) {
		return getByKey(id);
	}

	@Override
	public CollateralAgreement findByAgreementNumber(String agreementNumber) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("agreementNumber", agreementNumber));
        return (CollateralAgreement) crit.uniqueResult();
	}

	@Override
	public void save(CollateralAgreement agreement) {
		persist(agreement);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        CollateralAgreement agreement = (CollateralAgreement)crit.uniqueResult();
        delete(agreement);
	}

}
