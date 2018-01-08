package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.debtor.WorkSectorDao;
import kg.gov.mf.loan.manage.model.debtor.WorkSector;

@Service("workSectorService")
@Transactional
public class WorkSectorServiceImpl implements WorkSectorService{
	
	@Autowired
	private WorkSectorDao sectorDao;

	@Override
	public WorkSector findById(long id) {
		return this.sectorDao.findById(id);
	}

	@Override
	public WorkSector findByName(String name) {
		return this.sectorDao.findByName(name);
	}

	@Override
	public void save(WorkSector sector) {
		this.sectorDao.save(sector);
	}

	@Override
	public void update(WorkSector sector) {
		WorkSector entity = this.sectorDao.findById(sector.getId());
        if(entity!=null){
            entity.setName(sector.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.sectorDao.deleteById(id);
	}

	@Override
	public List<WorkSector> findAll() {
		return  this.sectorDao.findAll();
	}

}
