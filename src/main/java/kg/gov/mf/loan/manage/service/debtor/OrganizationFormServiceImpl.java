package kg.gov.mf.loan.manage.service.debtor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.debtor.OrganizationForm;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("organizationFormService")
@Transactional
public class OrganizationFormServiceImpl extends GenericServiceImpl<OrganizationForm> implements OrganizationFormService{
}
