package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.BankruptDao;
import kg.gov.mf.loan.manage.model.loan.Bankrupt;

@Service("bankruptService")
@Transactional
public class BankruptServiceImpl implements BankruptService{
	
	@Autowired
	private BankruptDao bDao;

	@Override
	public Bankrupt findById(long id) {
		return this.bDao.findById(id);
	}

	@Override
	public void save(Bankrupt b) {
		this.bDao.save(b);
	}

	@Override
	public void update(Bankrupt b) {
		Bankrupt entity = this.bDao.findById(b.getId());
        if(entity!=null){
        	entity.setStartedOnDate(b.getStartedOnDate());
        	entity.setFinishedOnDate(b.getFinishedOnDate());
        }
	}

	@Override
	public void deleteById(long id) {
		this.bDao.deleteById(id);
	}

	@Override
	public List<Bankrupt> findAll() {
		return this.bDao.findAll();
	}

}
