package kg.gov.mf.loan.manage.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.order.CreditOrderStateDao;
import kg.gov.mf.loan.manage.model.order.CreditOrderState;

@Service("creditOrderStateService")
@Transactional
public class CreditOrderStateServiceImpl implements CreditOrderStateService{
	
	@Autowired
	private CreditOrderStateDao stateDao;

	@Override
	public CreditOrderState findById(long id) {
		return this.stateDao.findById(id);
	}

	@Override
	public CreditOrderState findByName(String name) {
		return this.stateDao.findByName(name);
	}

	@Override
	public void save(CreditOrderState state) {
		this.stateDao.save(state);
	}

	@Override
	public void update(CreditOrderState state) {
		CreditOrderState entity = this.stateDao.findById(state.getId());
        if(entity!=null){
            entity.setName(state.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.stateDao.deleteById(id);
	}

	@Override
	public List<CreditOrderState> findAll() {
		return this.stateDao.findAll();
	}

	@Override
	public boolean isTypeNameUnique(long id, String name) {
		CreditOrderState state = findByName(name);
        return (state == null || ((id != 0L) && (state.getId() == id)));
	}
}
