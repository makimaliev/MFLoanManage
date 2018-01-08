package kg.gov.mf.loan.manage.dao.orderterm;

import java.util.List;

import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;

public interface AgreementTemplateDao {
	
	List<AgreementTemplate> findAll();
	AgreementTemplate findById(long id);
	AgreementTemplate findByName(String name);
    void save(AgreementTemplate template);
    void deleteById(long id);

}
