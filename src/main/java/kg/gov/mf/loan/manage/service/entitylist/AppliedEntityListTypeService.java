package kg.gov.mf.loan.manage.service.entitylist;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListType;

public interface AppliedEntityListTypeService {

	AppliedEntityListType findById(long id);
	AppliedEntityListType findByName(String name);
	void save(AppliedEntityListType type);
	void update(AppliedEntityListType type);
	void deleteById(long id);
	List<AppliedEntityListType> findAll(); 
	boolean isTypeNameUnique(long id, String name);
	
}
