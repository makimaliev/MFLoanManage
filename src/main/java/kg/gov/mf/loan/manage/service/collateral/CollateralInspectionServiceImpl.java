package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralInspection;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralInspectionService")
@Transactional
public class CollateralInspectionServiceImpl extends GenericServiceImpl<CollateralInspection> implements CollateralInspectionService{
}
