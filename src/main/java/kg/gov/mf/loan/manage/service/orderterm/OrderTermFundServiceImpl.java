package kg.gov.mf.loan.manage.service.orderterm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderterm.OrderTermFundDao;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFund;

@Service("orderTermFundService")
@Transactional
public class OrderTermFundServiceImpl implements OrderTermFundService{
	
	@Autowired
	private OrderTermFundDao fundDao;

	@Override
	public OrderTermFund findById(long id) {
		return this.fundDao.findById(id);
	}

	@Override
	public OrderTermFund findByName(String name) {
		return this.fundDao.findByName(name);
	}

	@Override
	public void save(OrderTermFund fund) {
		this.fundDao.save(fund);
	}

	@Override
	public void update(OrderTermFund fund) {
		OrderTermFund entity = this.fundDao.findById(fund.getId());
        if(entity!=null){
            entity.setName(fund.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.fundDao.deleteById(id);
	}

	@Override
	public List<OrderTermFund> findAll() {
		return this.fundDao.findAll();
	}

}
