package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.GroupByCollateralExistense;
import kg.gov.mf.loan.manage.model.loan.GroupByLoanPeriod;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("groupByCollateralExistenseService")
@Transactional
public class GroupByCollateralExistenseServiceImpl extends GenericServiceImpl<GroupByCollateralExistense> implements GroupByCollateralExistenseService{
}
