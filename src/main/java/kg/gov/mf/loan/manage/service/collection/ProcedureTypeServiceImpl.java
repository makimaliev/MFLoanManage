package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.ProcedureTypeDao;
import kg.gov.mf.loan.manage.model.collection.ProcedureType;

@Service("procedureTypeService")
@Transactional
public class ProcedureTypeServiceImpl implements ProcedureTypeService {
	
	@Autowired
	private ProcedureTypeDao dao;

	@Override
	public ProcedureType findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(ProcedureType type) {
		this.dao.save(type);
	}

	@Override
	public void update(ProcedureType type) {
		ProcedureType entity = this.dao.findById(type.getId());
		if(entity != null)
		{
			entity.setName(type.getName());
		}
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<ProcedureType> findAll() {
		return this.dao.findAll();
	}

}
