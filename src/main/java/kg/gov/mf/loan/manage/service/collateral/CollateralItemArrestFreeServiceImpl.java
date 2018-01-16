package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemArrestFree;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralItemArrestFreeService")
@Transactional
public class CollateralItemArrestFreeServiceImpl extends GenericServiceImpl<CollateralItemArrestFree> implements CollateralItemArrestFreeService {
}
