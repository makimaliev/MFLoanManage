package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.InstallmentState;

public interface InstallmentStateService {

	InstallmentState findById(long id);
	InstallmentState findByName(String name);
	void save(InstallmentState state);
	void update(InstallmentState state);
	void deleteById(long id);
	List<InstallmentState> findAll();
	
}
