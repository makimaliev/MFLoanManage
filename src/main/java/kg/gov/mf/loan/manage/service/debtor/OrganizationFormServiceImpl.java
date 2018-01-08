package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.debtor.OrganizationFormDao;
import kg.gov.mf.loan.manage.model.debtor.OrganizationForm;

@Service("organizationFormService")
@Transactional
public class OrganizationFormServiceImpl implements OrganizationFormService{
	
	@Autowired
	private OrganizationFormDao formDao;

	@Override
	public OrganizationForm findById(long id) {
		return this.formDao.findById(id);
	}

	@Override
	public OrganizationForm findByName(String name) {
		return this.formDao.findByName(name);
	}

	@Override
	public void save(OrganizationForm form) {
		this.formDao.save(form);
	}

	@Override
	public void update(OrganizationForm form) {
		OrganizationForm entity = this.formDao.findById(form.getId());
        if(entity!=null){
            entity.setName(form.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.formDao.deleteById(id);
	}

	@Override
	public List<OrganizationForm> findAll() {
		return this.formDao.findAll();
	}

}
