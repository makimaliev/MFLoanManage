package kg.gov.mf.loan.manage.dao.entitylist;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

public interface AppliedEntityListDao {
	
	List<AppliedEntityList> findAll();
	AppliedEntityList findById(long id);
	AppliedEntityList findByListNumber(String listNumber);
    void save(AppliedEntityList list);
    void deleteById(long id);

}
