package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.ReconstructedList;

public interface ReconstructedListService {

	ReconstructedList findById(long id);
	void save(ReconstructedList rl);
	void update(ReconstructedList rl);
	void deleteById(long id);
	List<ReconstructedList> findAll();
	
}
