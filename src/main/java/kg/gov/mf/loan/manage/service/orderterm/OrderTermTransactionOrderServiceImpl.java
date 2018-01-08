package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermTransactionOrderDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

@Service("orderTermTransactionOrderService")
@Transactional
public class OrderTermTransactionOrderServiceImpl implements OrderTermTransactionOrderService{
	
	@Autowired
	private OrderTermTransactionOrderDao orderDao;

	@Override
	public OrderTermTransactionOrder findById(long id) {
		return this.orderDao.findById(id);
	}

	@Override
	public OrderTermTransactionOrder findByName(String name) {
		return this.orderDao.findByName(name);
	}

	@Override
	public void save(OrderTermTransactionOrder order) {
		this.orderDao.save(order);
	}

	@Override
	public void update(OrderTermTransactionOrder order) {
		OrderTermTransactionOrder entity = this.orderDao.findById(order.getId());
        if(entity!=null){
            entity.setName(order.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.orderDao.deleteById(id);
	}

	@Override
	public List<OrderTermTransactionOrder> findAll() {
		return this.orderDao.findAll();
	}

}
