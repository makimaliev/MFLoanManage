package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.debtor.OrganizationForm;

@Repository("organizationFormDao")
public class OrganizationFormDaoImpl extends AbstractDao<Long, OrganizationForm> implements OrganizationFormDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrganizationForm> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<OrganizationForm> types = (List<OrganizationForm>) criteria.list();
		return types;
	}

	@Override
	public OrganizationForm findById(long id) {
		return getByKey(id);
	}

	@Override
	public OrganizationForm findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (OrganizationForm) crit.uniqueResult();
	}

	@Override
	public void save(OrganizationForm form) {
		persist(form);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        OrganizationForm type = (OrganizationForm)crit.uniqueResult();
        delete(type);
	}

}
