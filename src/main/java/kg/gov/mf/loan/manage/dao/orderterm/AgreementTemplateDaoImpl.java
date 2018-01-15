package kg.gov.mf.loan.manage.dao.orderterm;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;

@Repository("agreementTemplateDao")
public class AgreementTemplateDaoImpl extends GenericDaoImpl<AgreementTemplate> implements AgreementTemplateDao{
}
