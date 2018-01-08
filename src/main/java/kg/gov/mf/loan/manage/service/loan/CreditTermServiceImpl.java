package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.CreditTermDao;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

@Service("creditTermService")
@Transactional
public class CreditTermServiceImpl implements CreditTermService{
	
	@Autowired
	private CreditTermDao termDao;

	@Override
	public CreditTerm findById(long id) {
		return this.termDao.findById(id);
	}

	@Override
	public void save(CreditTerm term) {
		this.termDao.save(term);
	}

	@Override
	public void update(CreditTerm term) {
		CreditTerm entity = this.termDao.findById(term.getId());
        if(entity!=null){
        	entity.setStartDate(term.getStartDate());
        	entity.setInterestRateValue(term.getInterestRateValue());
        	entity.setRatePeriod(term.getRatePeriod());
        	entity.setFloatingRateType(term.getFloatingRateType());
        	entity.setPenaltyOnPrincipleOverdueRateValue(term.getPenaltyOnPrincipleOverdueRateValue());
        	entity.setPenaltyOnPrincipleOverdueRateType(term.getPenaltyOnPrincipleOverdueRateType());
        	entity.setPenaltyOnInterestOverdueRateValue(term.getPenaltyOnInterestOverdueRateValue());
        	entity.setPenaltyOnInterestOverdueRateType(term.getPenaltyOnInterestOverdueRateType());
        	entity.setPenaltyLimitPercent(term.getPenaltyLimitPercent());
        	entity.setPenaltyLimitEndDate(term.getPenaltyLimitEndDate());
        	entity.setTransactionOrder(term.getTransactionOrder());
        	entity.setDaysInMonthMethod(term.getDaysInMonthMethod());
        	entity.setDaysInYearMethod(term.getDaysInYearMethod());
        }
	}

	@Override
	public void deleteById(long id) {
		this.termDao.deleteById(id);
	}

	@Override
	public List<CreditTerm> findAll() {
		return this.termDao.findAll();
	}

}
