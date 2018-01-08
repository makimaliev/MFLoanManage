package kg.gov.mf.loan.manage.dao.entitylist;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListType;

public interface AppliedEntityListTypeDao {

	List<AppliedEntityListType> findAll();
	AppliedEntityListType findById(long id);
	AppliedEntityListType findByName(String name);
    void save(AppliedEntityListType type);
    void deleteById(long id);
	
}
