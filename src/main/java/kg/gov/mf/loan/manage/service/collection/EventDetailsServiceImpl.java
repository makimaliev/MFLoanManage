package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.EventDetailsDao;
import kg.gov.mf.loan.manage.model.collection.EventDetails;

@Service("eventDetailsService")
@Transactional
public class EventDetailsServiceImpl implements EventDetailsService{
	
	@Autowired
	private EventDetailsDao dao;

	@Override
	public EventDetails findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(EventDetails details) {
		this.dao.save(details);
	}

	@Override
	public void update(EventDetails details) {
		EventDetails entity = this.dao.findById(details.getId());
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
	public List<EventDetails> findAll() {
		return this.dao.findAll();
	}

}
