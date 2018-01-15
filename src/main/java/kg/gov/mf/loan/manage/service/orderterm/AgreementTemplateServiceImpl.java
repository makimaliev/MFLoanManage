package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("agreementTemplateService")
@Transactional
public class AgreementTemplateServiceImpl extends GenericServiceImpl<AgreementTemplate> implements AgreementTemplateService{
}
