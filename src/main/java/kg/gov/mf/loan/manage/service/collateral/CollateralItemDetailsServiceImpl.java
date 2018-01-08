package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralItemDetailsDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemDetails;

@Service("collateralItemDetailsService")
@Transactional
public class CollateralItemDetailsServiceImpl implements CollateralItemDetailsService{
	
	@Autowired
	private CollateralItemDetailsDao detailsDao;

	@Override
	public CollateralItemDetails findById(long id) {
		return this.detailsDao.findById(id);
	}

	@Override
	public void save(CollateralItemDetails details) {
		this.detailsDao.save(details);
	}

	@Override
	public void update(CollateralItemDetails details) {
		CollateralItemDetails entity = this.detailsDao.findById(details.getId());
        if(entity!=null){
        	entity.setDetails1(details.getDetails1());
        	entity.setDetails2(details.getDetails2());
        	entity.setDetails3(details.getDetails3());
        	entity.setDetails4(details.getDetails4());
        	entity.setDetails5(details.getDetails5());
        	entity.setDetails6(details.getDetails6());
        }
	}

	@Override
	public void deleteById(long id) {
		this.detailsDao.deleteById(id);
	}

	@Override
	public List<CollateralItemDetails> findAll() {
		return this.detailsDao.findAll();
	}

}
