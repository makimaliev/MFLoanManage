package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.PhaseType;

public interface PhaseTypeDao {

	List<PhaseType> findAll();
	PhaseType findById(long id);
    void save(PhaseType entity);
    void deleteById(long id);
	
}
