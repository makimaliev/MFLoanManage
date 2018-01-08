package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.debtor.DebtorTypeDao;
import kg.gov.mf.loan.manage.model.debtor.DebtorType;

@Service("debtorTypeService")
@Transactional
public class DebtorTypeServiceImpl implements DebtorTypeService{
	
	@Autowired
	private DebtorTypeDao typeDao;

	@Override
	public DebtorType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public DebtorType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(DebtorType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(DebtorType type) {
		DebtorType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<DebtorType> findAll() {
		return this.typeDao.findAll();
	}

}
