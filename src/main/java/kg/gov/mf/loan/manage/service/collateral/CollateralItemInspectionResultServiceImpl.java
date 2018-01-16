package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemInspectionResult;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralItemInspectionResultService")
@Transactional
public class CollateralItemInspectionResultServiceImpl extends GenericServiceImpl<CollateralItemInspectionResult> implements CollateralItemInspectionResultService{
}
