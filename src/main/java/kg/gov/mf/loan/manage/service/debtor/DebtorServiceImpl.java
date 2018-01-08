package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.debtor.DebtorDao;
import kg.gov.mf.loan.manage.model.debtor.Debtor;

@Service("debtorService")
@Transactional
public class DebtorServiceImpl implements DebtorService{
	
	@Autowired
	private DebtorDao debtorDao;

	@Override
	public Debtor findById(long id) {
		return this.debtorDao.findById(id);
	}

	@Override
	public Debtor findByName(String name) {
		return this.debtorDao.findByName(name);
	}

	@Override
	public void save(Debtor debtor) {
		this.debtorDao.save(debtor);
	}

	@Override
	public void update(Debtor debtor) {
		Debtor entity = this.debtorDao.findById(debtor.getId());
        if(entity!=null){
        	entity.setName(debtor.getName());
        	entity.setDebtorType(debtor.getDebtorType());
        	entity.setOrgForm(debtor.getOrgForm());
        	entity.setWorkSector(debtor.getWorkSector());
        }
	}

	@Override
	public void deleteById(long id) {
		this.debtorDao.deleteById(id);
	}

	@Override
	public List<Debtor> findAll() {
		return this.debtorDao.findAll();
	}

}
