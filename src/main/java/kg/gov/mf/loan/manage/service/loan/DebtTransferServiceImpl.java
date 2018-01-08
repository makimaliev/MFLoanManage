package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.DebtTransferDao;
import kg.gov.mf.loan.manage.model.loan.DebtTransfer;

@Service("debtTransferService")
@Transactional
public class DebtTransferServiceImpl implements DebtTransferService{
	
	@Autowired
	private DebtTransferDao dtDao;

	@Override
	public DebtTransfer findById(long id) {
		return this.dtDao.findById(id);
	}

	@Override
	public void save(DebtTransfer dt) {
		this.dtDao.save(dt);
	}

	@Override
	public void update(DebtTransfer dt) {
		DebtTransfer entity = this.dtDao.findById(dt.getId());
        if(entity!=null){
        	entity.setNumber(dt.getNumber());
        	entity.setDate(dt.getDate());
        	entity.setQuantity(dt.getQuantity());
        	entity.setPricePerUnit(dt.getPricePerUnit());
        	entity.setUnitTypeId(dt.getUnitTypeId());
        	entity.setTotalCost(dt.getTotalCost());
        	entity.setTransferPaymentId(dt.getTransferPaymentId());
        	entity.setTransferCreditId(dt.getTransferCreditId());
        	entity.setTransferPersonId(dt.getTransferPersonId());
        	entity.setGoodsTypeId(dt.getGoodsTypeId());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dtDao.deleteById(id);
	}

	@Override
	public List<DebtTransfer> findAll() {
		return this.dtDao.findAll();
	}

}
