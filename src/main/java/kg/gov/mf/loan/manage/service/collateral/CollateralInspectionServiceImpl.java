package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralInspectionDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralInspection;

@Service("collateralInspectionService")
@Transactional
public class CollateralInspectionServiceImpl implements CollateralInspectionService{
	
	@Autowired
	private CollateralInspectionDao inspectionDao;

	@Override
	public CollateralInspection findById(long id) {
		return this.inspectionDao.findById(id);
	}

	@Override
	public void save(CollateralInspection inspection) {
		this.inspectionDao.save(inspection);
	}

	@Override
	public void update(CollateralInspection inspection) {
		CollateralInspection entity = this.inspectionDao.findById(inspection.getId());
        if(entity!=null){
        	entity.setName(inspection.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.inspectionDao.deleteById(id);
	}

	@Override
	public List<CollateralInspection> findAll() {
		return this.inspectionDao.findAll();
	}

}
