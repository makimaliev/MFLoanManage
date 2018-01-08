package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.WriteOff;

public interface WriteOffService {

	WriteOff findById(long id);
	void save(WriteOff wo);
	void update(WriteOff wo);
	void deleteById(long id);
	List<WriteOff> findAll();
	
}
