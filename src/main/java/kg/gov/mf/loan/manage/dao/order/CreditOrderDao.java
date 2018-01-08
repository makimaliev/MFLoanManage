package kg.gov.mf.loan.manage.dao.order;

import java.util.List;

import kg.gov.mf.loan.manage.model.order.CreditOrder;

public interface CreditOrderDao {
	List<CreditOrder> findAll();
	CreditOrder findById(long id);
	CreditOrder findByRegNumber(String regNumber);
    void save(CreditOrder order);
    void deleteById(long id);
}
