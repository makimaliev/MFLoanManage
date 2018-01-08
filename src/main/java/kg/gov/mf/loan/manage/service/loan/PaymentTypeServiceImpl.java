package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.PaymentTypeDao;
import kg.gov.mf.loan.manage.model.loan.PaymentType;

@Service("paymentTypeService")
@Transactional
public class PaymentTypeServiceImpl implements PaymentTypeService{
	
	@Autowired
	private PaymentTypeDao typeDao;

	@Override
	public PaymentType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public PaymentType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(PaymentType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(PaymentType type) {
		PaymentType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<PaymentType> findAll() {
		return this.typeDao.findAll();
	}

}
