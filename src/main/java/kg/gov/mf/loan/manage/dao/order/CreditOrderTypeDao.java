package kg.gov.mf.loan.manage.dao.order;

import java.util.List;

import kg.gov.mf.loan.manage.model.order.CreditOrderType;

public interface CreditOrderTypeDao {
	
	List<CreditOrderType> findAll();
	CreditOrderType findById(long id);
    CreditOrderType findByName(String name);
    void save(CreditOrderType type);
    void deleteById(long id);

}
