package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.PhaseDetails;

public interface PhaseDetailsDao {

	List<PhaseDetails> findAll();
	PhaseDetails findById(long id);
    void save(PhaseDetails entity);
    void deleteById(long id);
	
}
