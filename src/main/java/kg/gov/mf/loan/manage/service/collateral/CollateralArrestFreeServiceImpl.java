package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralArrestFreeDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralArrestFree;

@Service("collateralArrestFreeService")
@Transactional
public class CollateralArrestFreeServiceImpl implements CollateralArrestFreeService{
	
	@Autowired
	private CollateralArrestFreeDao afDao;

	@Override
	public CollateralArrestFree findById(long id) {
		return this.afDao.findById(id);
	}

	@Override
	public void save(CollateralArrestFree af) {
		this.afDao.save(af);
	}

	@Override
	public void update(CollateralArrestFree af) {
		CollateralArrestFree entity = this.afDao.findById(af.getId());
        if(entity!=null){
        	entity.setName(af.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.afDao.deleteById(id);
	}

	@Override
	public List<CollateralArrestFree> findAll() {
		return this.afDao.findAll();
	}

}
