package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.WriteOff;

public interface WriteOffDao {

	List<WriteOff> findAll();
	WriteOff findById(long id);
    void save(WriteOff writeOff);
    void deleteById(long id);
	
}
