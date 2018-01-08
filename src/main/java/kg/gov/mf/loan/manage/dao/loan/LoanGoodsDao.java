package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.LoanGoods;

public interface LoanGoodsDao {

	List<LoanGoods> findAll();
	LoanGoods findById(long id);
    void save(LoanGoods lg);
    void deleteById(long id);
	
}
