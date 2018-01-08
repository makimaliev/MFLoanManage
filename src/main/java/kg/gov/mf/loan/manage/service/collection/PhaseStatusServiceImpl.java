package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.PhaseStatusDao;
import kg.gov.mf.loan.manage.model.collection.PhaseStatus;

@Service("phaseStatusService")
@Transactional
public class PhaseStatusServiceImpl implements PhaseStatusService {
	
	@Autowired
	private PhaseStatusDao dao;

	@Override
	public PhaseStatus findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(PhaseStatus status) {
		this.dao.save(status);
	}

	@Override
	public void update(PhaseStatus status) {
		PhaseStatus entity = this.dao.findById(status.getId());
        if(entity!=null){
        	entity.setName(status.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<PhaseStatus> findAll() {
		return this.dao.findAll();
	}

}
