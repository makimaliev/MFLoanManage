package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.ReconstructedListDao;
import kg.gov.mf.loan.manage.model.loan.ReconstructedList;

@Service("reconstructedListService")
@Transactional
public class ReconstructedListServiceImpl implements ReconstructedListService{
	
	@Autowired
	private ReconstructedListDao rlDao;

	@Override
	public ReconstructedList findById(long id) {
		return this.rlDao.findById(id);
	}

	@Override
	public void save(ReconstructedList rl) {
		this.rlDao.save(rl);
	}

	@Override
	public void update(ReconstructedList rl) {
		ReconstructedList entity = this.rlDao.findById(rl.getId());
        if(entity!=null){
        	entity.setOnDate(rl.getOnDate());
        	entity.setOldLoanId(rl.getOldLoanId());
        }
	}

	@Override
	public void deleteById(long id) {
		this.rlDao.deleteById(id);
	}

	@Override
	public List<ReconstructedList> findAll() {
		return this.rlDao.findAll();
	}

}
