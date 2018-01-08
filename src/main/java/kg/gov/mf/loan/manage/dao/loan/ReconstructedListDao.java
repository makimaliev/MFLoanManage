package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.ReconstructedList;

public interface ReconstructedListDao {

	List<ReconstructedList> findAll();
	ReconstructedList findById(long id);
    void save(ReconstructedList rl);
    void deleteById(long id);
	
}
