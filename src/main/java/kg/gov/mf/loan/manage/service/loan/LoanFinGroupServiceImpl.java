package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.LoanFinGroup;
import kg.gov.mf.loan.manage.model.loan.LoanState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loanFinGroupService")
@Transactional
public class LoanFinGroupServiceImpl extends GenericServiceImpl<LoanFinGroup> implements LoanFinGroupService {
}
