package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.AgreementTemplateDao;
import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;

@Service("agreementTemplateService")
@Transactional
public class AgreementTemplateServiceImpl implements AgreementTemplateService{
	
	@Autowired
	private AgreementTemplateDao templateDao;

	@Override
	public AgreementTemplate findById(long id) {
		return this.templateDao.findById(id);
	}

	@Override
	public AgreementTemplate findByName(String name) {
		return this.templateDao.findByName(name);
	}

	@Override
	public void save(AgreementTemplate template) {
		this.templateDao.save(template);
		
	}

	@Override
	public void update(AgreementTemplate template) {
		AgreementTemplate entity = this.templateDao.findById(template.getId());
		if(entity!=null){
			entity.setName(template.getName());
			entity.setApprovedBy(template.getApprovedBy());
			entity.setApprovedDate(template.getApprovedDate());
			entity.setApprovedDescription(template.getApprovedDescription());
			entity.setCreatedBy(template.getCreatedBy());
			entity.setCreatedDate(template.getCreatedDate());
			entity.setCreatedDescription(template.getCreatedDescription());
		}
		
	}

	@Override
	public void deleteById(long id) {
		this.templateDao.deleteById(id);
	}

	@Override
	public List<AgreementTemplate> findAll() {
		return this.templateDao.findAll();
	}

}
