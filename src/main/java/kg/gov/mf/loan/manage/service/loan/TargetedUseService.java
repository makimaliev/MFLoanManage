package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.TargetedUse;

public interface TargetedUseService {

	TargetedUse findById(long id);
	void save(TargetedUse tu);
	void update(TargetedUse tu);
	void deleteById(long id);
	List<TargetedUse> findAll();
	
}
