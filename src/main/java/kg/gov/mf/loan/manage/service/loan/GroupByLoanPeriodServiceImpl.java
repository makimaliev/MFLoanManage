package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.DestinationAccount;
import kg.gov.mf.loan.manage.model.loan.GroupByLoanPeriod;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("groupByLoanPeriodService")
@Transactional
public class GroupByLoanPeriodServiceImpl extends GenericServiceImpl<GroupByLoanPeriod> implements GroupByLoanPeriodService{
}
