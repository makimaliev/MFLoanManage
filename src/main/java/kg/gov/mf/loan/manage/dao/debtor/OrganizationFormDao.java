package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.OrganizationForm;

public interface OrganizationFormDao {

	List<OrganizationForm> findAll();
	OrganizationForm findById(long id);
	OrganizationForm findByName(String name);
    void save(OrganizationForm form);
    void deleteById(long id);
	
}
