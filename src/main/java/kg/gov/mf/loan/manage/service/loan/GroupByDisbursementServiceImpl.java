package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.GroupByDisbursement;
import kg.gov.mf.loan.manage.model.loan.GroupByLoanPeriod;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("groupByDisbursementService")
@Transactional
public class GroupByDisbursementServiceImpl extends GenericServiceImpl<GroupByDisbursement> implements GroupByDisbursementService{
}
