package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.WriteOffDao;
import kg.gov.mf.loan.manage.model.loan.WriteOff;

@Service("writeOffService")
@Transactional
public class WriteOffServiceImpl implements WriteOffService{
	
	@Autowired
	private WriteOffDao woDao;

	@Override
	public WriteOff findById(long id) {
		return this.woDao.findById(id);
	}

	@Override
	public void save(WriteOff wo) {
		this.woDao.save(wo);
	}

	@Override
	public void update(WriteOff wo) {
		WriteOff entity = this.woDao.findById(wo.getId());
        if(entity!=null){
        	entity.setDate(wo.getDate());
        	entity.setTotalAmount(wo.getTotalAmount());
        	entity.setPrincipal(wo.getPrincipal());
        	entity.setInterest(wo.getInterest());
        	entity.setPenalty(wo.getPenalty());
        	entity.setFee(wo.getFee());
        	entity.setDescription(wo.getDescription());
        }
	}

	@Override
	public void deleteById(long id) {
		this.woDao.deleteById(id);
	}

	@Override
	public List<WriteOff> findAll() {
		return this.woDao.findAll();
	}

}
