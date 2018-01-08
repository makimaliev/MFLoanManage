package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.LoanGoodsDao;
import kg.gov.mf.loan.manage.model.loan.LoanGoods;

@Service("loanGoodsService")
@Transactional
public class LoanGoodsServiceImpl implements LoanGoodsService{
	
	@Autowired
	private LoanGoodsDao lgDao;

	@Override
	public LoanGoods findById(long id) {
		return this.lgDao.findById(id);
	}

	@Override
	public void save(LoanGoods lg) {
		this.lgDao.save(lg);
	}

	@Override
	public void update(LoanGoods lg) {
		LoanGoods entity = this.lgDao.findById(lg.getId());
        if(entity!=null){
        	entity.setQuantity(lg.getQuantity());
        	entity.setUnitTypeId(lg.getUnitTypeId());
        	entity.setGoodsTypeId(lg.getGoodsTypeId());
        }
	}

	@Override
	public void deleteById(long id) {
		this.lgDao.deleteById(id);
	}

	@Override
	public List<LoanGoods> findAll() {
		return this.lgDao.findAll();
	}

}
