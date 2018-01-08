package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.LoanDao;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Service("loanService")
@Transactional
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	private LoanDao loanDao;

	@Override
	public Loan findById(long id) {
		return this.loanDao.findById(id);
	}

	@Override
	public Loan findByRegNumber(String regNumber) {
		return this.loanDao.findByRegNumber(regNumber);
	}

	@Override
	public void save(Loan loan) {
		this.loanDao.save(loan);
	}

	@Override
	public void update(Loan loan) {
		Loan entity = this.loanDao.findById(loan.getId());
        if(entity!=null){
        	entity.setRegNumber(loan.getRegNumber());
        	entity.setRegDate(loan.getRegDate());
        	entity.setAmount(loan.getAmount());
        	entity.setCurrency(loan.getCurrency());
        	entity.setLoanType(loan.getLoanType());
        	entity.setLoanState(loan.getLoanState());
        	entity.setSupervisorId(loan.getSupervisorId());
        	entity.setHasSubLoan(loan.isHasSubLoan());
        	entity.setCreditOrder(loan.getCreditOrder());
        	entity.setParentLoan(loan.getParentLoan());
        	entity.setCollateralAgreements(loan.getCollateralAgreements());
        }
	}

	@Override
	public void deleteById(long id) {
		this.loanDao.deleteById(id);
	}

	@Override
	public List<Loan> findAll() {
		return this.loanDao.findAll();
	} 

}
