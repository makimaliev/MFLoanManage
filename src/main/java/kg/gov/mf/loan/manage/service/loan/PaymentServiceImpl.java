package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.PaymentDao;
import kg.gov.mf.loan.manage.model.loan.Payment;

@Service("paymentService")
@Transactional
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentDao paymentDao;

	@Override
	public Payment findById(long id) {
		return this.paymentDao.findById(id);
	}

	@Override
	public void save(Payment payment) {
		this.paymentDao.save(payment);
	}

	@Override
	public void update(Payment payment) {
		Payment entity = this.paymentDao.findById(payment.getId());
        if(entity!=null){
        	entity.setPaymentDate(payment.getPaymentDate());
        	entity.setTotalAmount(payment.getTotalAmount());
        	entity.setPrincipal(payment.getPrincipal());
        	entity.setInterest(payment.getInterest());
        	entity.setPenalty(payment.getPenalty());
        	entity.setFee(payment.getFee());
        	entity.setNumber(payment.getNumber());
        	entity.setPaymentType(payment.getPaymentType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.paymentDao.deleteById(id);
	}

	@Override
	public List<Payment> findAll() {
		return this.paymentDao.findAll();
	}

}
