package kg.gov.mf.loan.manage.service.entitylist;

import java.util.List;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

public interface AppliedEntityListService {
	
	AppliedEntityList findById(long id);
	AppliedEntityList findByListNumber(String listNumber);
	void save(AppliedEntityList list);
	void update(AppliedEntityList list);
	void deleteById(long id);
	List<AppliedEntityList> findAll();

}
