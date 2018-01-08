package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import kg.gov.mf.loan.manage.model.loan.DebtTransfer;

public interface DebtTransferService {

	DebtTransfer findById(long id);
	void save(DebtTransfer dt);
	void update(DebtTransfer dt);
	void deleteById(long id);
	List<DebtTransfer> findAll();
	
}
