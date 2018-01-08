package kg.gov.mf.loan.manage.dao.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.DebtTransfer;

public interface DebtTransferDao {

	List<DebtTransfer> findAll();
	DebtTransfer findById(long id);
    void save(DebtTransfer dt);
    void deleteById(long id);
	
}
