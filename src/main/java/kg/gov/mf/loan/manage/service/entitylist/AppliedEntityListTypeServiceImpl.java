package kg.gov.mf.loan.manage.service.entitylist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entitylist.AppliedEntityListTypeDao;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListType;

@Service("appliedEntityListTypeService")
@Transactional
public class AppliedEntityListTypeServiceImpl implements AppliedEntityListTypeService {
	
	@Autowired
	private AppliedEntityListTypeDao typeDao;

	@Override
	public AppliedEntityListType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public AppliedEntityListType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(AppliedEntityListType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(AppliedEntityListType type) {
		AppliedEntityListType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<AppliedEntityListType> findAll() {
		return this.typeDao.findAll();
	}

	@Override
	public boolean isTypeNameUnique(long id, String name) {
		AppliedEntityListType type = findByName(name);
        return (type == null || ((id != 0L) && (type.getId() == id)));
	}

}
