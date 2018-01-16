package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.LoanType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("loanTypeService")
@Transactional
public class LoanTypeServiceImpl extends GenericServiceImpl<LoanType> implements LoanTypeService {
}
