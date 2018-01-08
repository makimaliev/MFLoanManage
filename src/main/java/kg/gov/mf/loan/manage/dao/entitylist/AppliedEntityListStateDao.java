package kg.gov.mf.loan.manage.dao.entitylist;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListState;

public interface AppliedEntityListStateDao {

	List<AppliedEntityListState> findAll();
	AppliedEntityListState findById(long id);
	AppliedEntityListState findByName(String name);
    void save(AppliedEntityListState state);
    void deleteById(long id);
	
}
