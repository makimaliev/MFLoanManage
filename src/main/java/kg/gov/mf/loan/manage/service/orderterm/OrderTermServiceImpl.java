package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

@Service("orderTermService")
@Transactional
public class OrderTermServiceImpl implements OrderTermService{
	
	@Autowired
	private OrderTermDao termDao;

	@Override
	public OrderTerm findById(long id) {
		return this.termDao.findById(id);
	}

	@Override
	public void save(OrderTerm term) {
		this.termDao.save(term);
	}

	@Override
	public void update(OrderTerm term) {
		OrderTerm entity = this.termDao.findById(term.getId());
		if(entity!=null){
			entity.setDescription(term.getDescription());
			entity.setFund(term.getFund());
			entity.setAmount(term.getAmount());
			entity.setCurrency(term.getCurrency());
			entity.setFrequencyQuantity(term.getFrequencyQuantity());
			entity.setFrequencyType(term.getFrequencyType());
			entity.setInstallmentQuantity(term.getInstallmentQuantity());
			entity.setInstallmentFirstDay(term.getInstallmentFirstDay());
			entity.setFirstInstallmentDate(term.getFirstInstallmentDate());
			entity.setLastInstallmentDate(term.getLastInstallmentDate());
			entity.setMinDaysDisbFirstInst(term.getMinDaysDisbFirstInst());
			entity.setMaxDaysDisbFirstInst(term.getMaxDaysDisbFirstInst());
			entity.setGraceOnPrinciplePaymentInst(term.getGraceOnPrinciplePaymentInst());
			entity.setGraceOnPrinciplePaymentDays(term.getGraceOnPrinciplePaymentDays());
			entity.setGraceOnInterestPaymentInst(term.getGraceOnInterestPaymentInst());
			entity.setGraceOnPrinciplePaymentDays(term.getGraceOnInterestPaymentDays());
			entity.setGraceOnInterestAccrInst(term.getGraceOnInterestAccrInst());
			entity.setGraceOnInterestAccrDays(term.getGraceOnInterestAccrDays());
			entity.setInterestRateValue(term.getInterestRateValue());
			entity.setInterestRateValuePerPeriod(term.getInterestRateValuePerPeriod());
			entity.setInterestType(term.getInterestType());
			entity.setPenaltyOnPrincipleOverdueRateValue(term.getPenaltyOnPrincipleOverdueRateValue());
			entity.setPenaltyOnPrincipleOverdueType(term.getPenaltyOnPrincipleOverdueType());
			entity.setPenaltyOnInterestOverdueRateValue(term.getPenaltyOnInterestOverdueRateValue());
			entity.setPenaltyOnInterestOverdueType(term.getPenaltyOnInterestOverdueType());
			entity.setDaysInYearMethod(term.getDaysInYearMethod());
			entity.setDaysInMonthMethod(term.getDaysInMonthMethod());
			entity.setTransactionOrder(term.getTransactionOrder());
			entity.setInterestAccrMethod(term.getInterestAccrMethod());
			entity.setEarlyRepaymentAllowed(term.isEarlyRepaymentAllowed());
			entity.setPenaltyLimitPercent(term.getPenaltyLimitPercent());
			entity.setCollateralFree(term.isCollateralFree());
		}
	}

	@Override
	public void deleteById(long id) {
		this.termDao.deleteById(id);
	}

	@Override
	public List<OrderTerm> findAll() {
		return this.termDao.findAll();
	}

}
