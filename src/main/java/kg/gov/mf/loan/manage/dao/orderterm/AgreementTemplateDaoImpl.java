package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.AbstractDao;
import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;

@Repository("agreementTemplateDao")
public class AgreementTemplateDaoImpl extends AbstractDao<Long, AgreementTemplate> implements AgreementTemplateDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<AgreementTemplate> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<AgreementTemplate> templates = (List<AgreementTemplate>) criteria.list();
		return templates;
	}

	@Override
	public AgreementTemplate findById(long id) {
		return getByKey(id);
	}

	@Override
	public AgreementTemplate findByName(String name) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("name", name));
        return (AgreementTemplate) crit.uniqueResult();
	}

	@Override
	public void save(AgreementTemplate template) {
		persist(template);
	}

	@Override
	public void deleteById(long id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        AgreementTemplate template = (AgreementTemplate)crit.uniqueResult();
        delete( template);
	}
	
}
