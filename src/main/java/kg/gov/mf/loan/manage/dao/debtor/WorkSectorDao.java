package kg.gov.mf.loan.manage.dao.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.WorkSector;

public interface WorkSectorDao {

	List<WorkSector> findAll();
	WorkSector findById(long id);
	WorkSector findByName(String name);
    void save(WorkSector sector);
    void deleteById(long id);
	
}
