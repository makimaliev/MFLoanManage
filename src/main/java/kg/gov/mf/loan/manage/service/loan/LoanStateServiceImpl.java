package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.LoanStateDao;
import kg.gov.mf.loan.manage.model.loan.LoanState;

@Service("loanStateService")
@Transactional
public class LoanStateServiceImpl implements LoanStateService {
	
	@Autowired
	private LoanStateDao stateDao;

	@Override
	public LoanState findById(long id) {
		return this.stateDao.findById(id);
	}

	@Override
	public LoanState findByName(String name) {
		return this.stateDao.findByName(name);
	}

	@Override
	public void save(LoanState state) {
		this.stateDao.save(state);
	}

	@Override
	public void update(LoanState state) {
		LoanState entity = this.stateDao.findById(state.getId());
        if(entity!=null){
            entity.setName(state.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.stateDao.deleteById(id);
	}

	@Override
	public List<LoanState> findAll() {
		return this.stateDao.findAll();
	}

}
