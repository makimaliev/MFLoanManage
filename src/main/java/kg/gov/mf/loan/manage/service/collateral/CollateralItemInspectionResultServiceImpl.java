package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralItemInspectionResultDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemInspectionResult;

@Service("collateralItemInspectionResultService")
@Transactional
public class CollateralItemInspectionResultServiceImpl implements CollateralItemInspectionResultService{
	
	@Autowired
	private CollateralItemInspectionResultDao resultDao;

	@Override
	public CollateralItemInspectionResult findById(long id) {
		return this.resultDao.findById(id);
	}

	@Override
	public void save(CollateralItemInspectionResult result) {
		this.resultDao.save(result);
	}

	@Override
	public void update(CollateralItemInspectionResult result) {
		CollateralItemInspectionResult entity = this.resultDao.findById(result.getId());
        if(entity!=null){
        	entity.setOnDate(result.getOnDate());
        	entity.setInspectionResultType(result.getInspectionResultType());
        	entity.setCollateralInspection(result.getCollateralInspection());
        }
	}

	@Override
	public void deleteById(long id) {
		this.resultDao.deleteById(id);
	}

	@Override
	public List<CollateralItemInspectionResult> findAll() {
		return this.resultDao.findAll();
	}

}
