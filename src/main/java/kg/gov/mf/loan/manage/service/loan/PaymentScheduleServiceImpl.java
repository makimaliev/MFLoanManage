package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.PaymentScheduleDao;
import kg.gov.mf.loan.manage.model.loan.PaymentSchedule;

@Service("paymentScheduleService")
@Transactional
public class PaymentScheduleServiceImpl implements PaymentScheduleService{
	
	@Autowired
	private PaymentScheduleDao psDao;

	@Override
	public PaymentSchedule findById(long id) {
		return this.psDao.findById(id);
	}

	@Override
	public void save(PaymentSchedule ps) {
		this.psDao.save(ps);
	}

	@Override
	public void update(PaymentSchedule ps) {
		PaymentSchedule entity = this.psDao.findById(ps.getId());
        if(entity!=null){
        	entity.setExpectedDate(ps.getExpectedDate());
        	entity.setDisbursement(ps.getDisbursement());
        	entity.setPrincipalPayment(ps.getPrincipalPayment());
        	entity.setInterestPayment(ps.getInterestPayment());
        	entity.setCollectedInterestPayment(ps.getCollectedInterestPayment());
        	entity.setCollectedPenaltyPayment(ps.getCollectedPenaltyPayment());
        	entity.setInstallmentState(ps.getInstallmentState());
        }
	}

	@Override
	public void deleteById(long id) {
		this.psDao.deleteById(id);
	}

	@Override
	public List<PaymentSchedule> findAll() {
		return this.psDao.findAll();
	}

}
