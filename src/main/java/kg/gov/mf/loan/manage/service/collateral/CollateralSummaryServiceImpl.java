package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralSummary;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralSummaryService")
@Transactional
public class CollateralSummaryServiceImpl extends GenericServiceImpl<CollateralSummary> implements CollateralSummaryService {
}
