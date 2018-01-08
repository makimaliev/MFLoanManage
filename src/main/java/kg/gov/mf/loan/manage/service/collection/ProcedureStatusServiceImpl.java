package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.ProcedureStatusDao;
import kg.gov.mf.loan.manage.model.collection.ProcedureStatus;

@Service("procedureStatusService")
@Transactional
public class ProcedureStatusServiceImpl implements ProcedureStatusService{
	
	@Autowired
	private ProcedureStatusDao dao;

	@Override
	public ProcedureStatus findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(ProcedureStatus status) {
		this.dao.save(status);
	}

	@Override
	public void update(ProcedureStatus status) {
		ProcedureStatus entity = this.dao.findById(status.getId());
		if(entity != null) {
			entity.setName(status.getName());
		}
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<ProcedureStatus> findAll() {
		return this.dao.findAll();
	}

}
