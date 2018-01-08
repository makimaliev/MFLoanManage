package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.InstallmentState;

public interface InstallmentStateDao {

	List<InstallmentState> findAll();
	InstallmentState findById(long id);
	InstallmentState findByName(String name);
    void save(InstallmentState state);
    void deleteById(long id);
	
}
