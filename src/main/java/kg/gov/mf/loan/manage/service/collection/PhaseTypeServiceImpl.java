package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.PhaseTypeDao;
import kg.gov.mf.loan.manage.model.collection.PhaseType;

@Service("phaseTypeService")
@Transactional
public class PhaseTypeServiceImpl implements PhaseTypeService {
	
	@Autowired
	private PhaseTypeDao dao;

	@Override
	public PhaseType findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(PhaseType type) {
		this.dao.save(type);
	}

	@Override
	public void update(PhaseType type) {
		PhaseType entity = this.dao.findById(type.getId());
		if(entity!=null)
		{
			entity.setName(type.getName());
		}
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<PhaseType> findAll() {
		return this.dao.findAll();
	}

}
