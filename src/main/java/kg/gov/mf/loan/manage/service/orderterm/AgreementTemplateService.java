package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;

public interface AgreementTemplateService {

	AgreementTemplate findById(long id);
	AgreementTemplate findByName(String name);
	void save(AgreementTemplate template);
	void update(AgreementTemplate template);
	void deleteById(long id);
	List<AgreementTemplate> findAll();
	
}
