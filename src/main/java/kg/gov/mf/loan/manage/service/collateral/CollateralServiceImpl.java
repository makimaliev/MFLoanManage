package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.Collateral;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralService")
@Transactional
public class CollateralServiceImpl extends GenericServiceImpl<Collateral> implements CollateralService{
}
