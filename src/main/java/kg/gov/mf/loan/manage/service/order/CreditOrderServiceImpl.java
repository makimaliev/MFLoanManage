package kg.gov.mf.loan.manage.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.order.CreditOrderDao;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Service("creditOrderService")
@Transactional
public class CreditOrderServiceImpl implements CreditOrderService{
	
	@Autowired
	private CreditOrderDao orderDao;

	@Override
	public CreditOrder findById(long id) {
		return this.orderDao.findById(id);
	}

	@Override
	public CreditOrder findByRegNumber(String regNumber) {
		return this.orderDao.findByRegNumber(regNumber);
	}

	@Override
	public void save(CreditOrder order) {
		this.orderDao.save(order);
	}

	@Override
	public void update(CreditOrder order) {
		CreditOrder entity = this.orderDao.findById(order.getId());
        if(entity!=null){
            entity.setRegNumber(order.getRegNumber());
            entity.setRegDate(order.getRegDate());
            entity.setDescription(order.getDescription());
            entity.setCreditOrderState(order.getCreditOrderState());
            entity.setCreditOrderType(order.getCreditOrderType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.orderDao.deleteById(id);
	}

	@Override
	public List<CreditOrder> findAll() {
		return this.orderDao.findAll();
	}

}
