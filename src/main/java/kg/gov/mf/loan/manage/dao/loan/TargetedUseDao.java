package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.TargetedUse;

public interface TargetedUseDao {

	List<TargetedUse> findAll();
	TargetedUse findById(long id);
    void save(TargetedUse tu);
    void deleteById(long id);
	
}
