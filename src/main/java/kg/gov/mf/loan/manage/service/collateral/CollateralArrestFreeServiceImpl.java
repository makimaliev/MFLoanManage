package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralArrestFree;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralArrestFreeService")
@Transactional
public class CollateralArrestFreeServiceImpl extends GenericServiceImpl<CollateralArrestFree> implements CollateralArrestFreeService{
}
