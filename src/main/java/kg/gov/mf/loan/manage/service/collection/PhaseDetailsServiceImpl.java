package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.PhaseDetailsDao;
import kg.gov.mf.loan.manage.model.collection.PhaseDetails;

@Service("phaseDetailsService")
@Transactional
public class PhaseDetailsServiceImpl implements PhaseDetailsService {
	
	@Autowired
	private PhaseDetailsDao dao;

	@Override
	public PhaseDetails findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(PhaseDetails details) {
		this.dao.save(details);
	}

	@Override
	public void update(PhaseDetails details) {
		PhaseDetails entity = this.dao.findById(details.getId());
        if(entity!=null){
        	entity.setStartTotalAmount(details.getStartTotalAmount());
        	entity.setStartPrincipal(details.getStartPrincipal());
        	entity.setStartInterest(details.getStartInterest());
        	entity.setStartPenalty(details.getStartPenalty());
        	entity.setStartFee(details.getStartFee());
        	entity.setCloseTotalAmount(details.getCloseTotalAmount());
        	entity.setClosePrincipal(details.getClosePrincipal());
        	entity.setCloseInterest(details.getCloseInterest());
        	entity.setClosePenalty(details.getClosePenalty());
        	entity.setCloseFee(details.getCloseFee());
        	entity.setPaidTotalAmount(details.getPaidTotalAmount());
        	entity.setPaidPrincipal(details.getPaidPrincipal());
        	entity.setPaidInterest(details.getPaidInterest());
        	entity.setPaidPenalty(details.getPaidPenalty());
        	entity.setPaidFee(details.getPaidFee());
        }
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<PhaseDetails> findAll() {
		return this.dao.findAll();
	}

}
