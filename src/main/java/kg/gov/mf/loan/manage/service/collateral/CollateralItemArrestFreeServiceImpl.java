package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralItemArrestFreeDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemArrestFree;

@Service("collateralItemArrestFreeService")
@Transactional
public class CollateralItemArrestFreeServiceImpl implements CollateralItemArrestFreeService {
	
	@Autowired
	private CollateralItemArrestFreeDao iafDao;

	@Override
	public CollateralItemArrestFree findById(long id) {
		return this.iafDao.findById(id);
	}

	@Override
	public void save(CollateralItemArrestFree iaf) {
		this.iafDao.save(iaf);
	}

	@Override
	public void update(CollateralItemArrestFree iaf) {
		CollateralItemArrestFree entity = this.iafDao.findById(iaf.getId());
        if(entity!=null){
        	entity.setOnDate(iaf.getOnDate());
        	entity.setArrestFreeBy(iaf.getArrestFreeBy());
        	entity.setCollateralArrestFree(iaf.getCollateralArrestFree());
        }
	}

	@Override
	public void deleteById(long id) {
		this.iafDao.deleteById(id);
	}

	@Override
	public List<CollateralItemArrestFree> findAll() {
		return this.iafDao.findAll();
	}

}
