package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.PhaseStatus;

public interface PhaseStatusDao {

	List<PhaseStatus> findAll();
	PhaseStatus findById(long id);
    void save(PhaseStatus entity);
    void deleteById(long id);
	
}
