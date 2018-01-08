package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.InstallmentStateDao;
import kg.gov.mf.loan.manage.model.loan.InstallmentState;

@Service("installmentStateService")
@Transactional
public class InstallmentStateServiceImpl implements InstallmentStateService{
	
	@Autowired
	private InstallmentStateDao stateDao;

	@Override
	public InstallmentState findById(long id) {
		return this.stateDao.findById(id);
	}

	@Override
	public InstallmentState findByName(String name) {
		return this.stateDao.findByName(name);
	}

	@Override
	public void save(InstallmentState state) {
		this.stateDao.save(state);
	}

	@Override
	public void update(InstallmentState state) {
		InstallmentState entity = this.stateDao.findById(state.getId());
        if(entity!=null){
            entity.setName(state.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.stateDao.deleteById(id);
	}

	@Override
	public List<InstallmentState> findAll() {
		return this.stateDao.findAll();
	}

}
