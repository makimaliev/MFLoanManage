package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.OrganizationForm;

public interface OrganizationFormService {

	OrganizationForm findById(long id);
	OrganizationForm findByName(String name);
	void save(OrganizationForm form);
	void update(OrganizationForm form);
	void deleteById(long id);
	List<OrganizationForm> findAll();
	
}
