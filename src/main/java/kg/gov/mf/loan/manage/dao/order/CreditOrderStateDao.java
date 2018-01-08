package kg.gov.mf.loan.manage.dao.order;

import java.util.List;

import kg.gov.mf.loan.manage.model.order.CreditOrderState;

public interface CreditOrderStateDao{
	
	List<CreditOrderState> findAll();
	CreditOrderState findById(long id);
	CreditOrderState findByName(String name);
    void save(CreditOrderState state);
    void deleteById(long id);
}
