package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.LoanGoods;

public interface LoanGoodsService {

	LoanGoods findById(long id);
	void save(LoanGoods lg);
	void update(LoanGoods lg);
	void deleteById(long id);
	List<LoanGoods> findAll();
	
}
