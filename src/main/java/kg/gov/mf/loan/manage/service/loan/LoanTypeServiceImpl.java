package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.LoanTypeDao;
import kg.gov.mf.loan.manage.model.loan.LoanType;

@Service("loanTypeService")
@Transactional
public class LoanTypeServiceImpl implements LoanTypeService {
	
	@Autowired
	private LoanTypeDao typeDao;

	@Override
	public LoanType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public LoanType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(LoanType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(LoanType type) {
		LoanType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<LoanType> findAll() {
		return this.typeDao.findAll();
	}

}
