package kg.gov.mf.loan.manage.service.debtor;

import java.util.List;

import kg.gov.mf.loan.manage.model.debtor.WorkSector;

public interface WorkSectorService {

	WorkSector findById(long id);
	WorkSector findByName(String name);
	void save(WorkSector sector);
	void update(WorkSector sector);
	void deleteById(long id);
	List<WorkSector> findAll();
	
}
