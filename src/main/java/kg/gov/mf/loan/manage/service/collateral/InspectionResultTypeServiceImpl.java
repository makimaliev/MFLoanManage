package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.InspectionResultTypeDao;
import kg.gov.mf.loan.manage.model.collateral.InspectionResultType;

@Service("inspectionResultTypeService")
@Transactional
public class InspectionResultTypeServiceImpl implements InspectionResultTypeService {
	
	@Autowired
	private InspectionResultTypeDao typeDao;

	@Override
	public InspectionResultType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public InspectionResultType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(InspectionResultType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(InspectionResultType type) {
		InspectionResultType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<InspectionResultType> findAll() {
		return this.typeDao.findAll();
	}

}
