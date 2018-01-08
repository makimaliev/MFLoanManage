package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralDao;
import kg.gov.mf.loan.manage.model.collateral.Collateral;

@Service("collateralService")
@Transactional
public class CollateralServiceImpl implements CollateralService{
	
	@Autowired
	private CollateralDao collDao;

	@Override
	public Collateral findById(long id) {
		return this.collDao.findById(id);
	}

	@Override
	public Collateral findByName(String name) {
		return this.collDao.findByName(name);
	}

	@Override
	public void save(Collateral coll) {
		this.collDao.save(coll);
	}

	@Override
	public void update(Collateral coll) {
		Collateral entity = this.collDao.findById(coll.getId());
        if(entity!=null){
        	entity.setName(coll.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.collDao.deleteById(id);
	}

	@Override
	public List<Collateral> findAll() {
		return this.collDao.findAll();
	}

}
