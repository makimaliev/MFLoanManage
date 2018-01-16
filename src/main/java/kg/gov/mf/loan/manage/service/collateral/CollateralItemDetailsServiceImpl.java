package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralItemDetails;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralItemDetailsService")
@Transactional
public class CollateralItemDetailsServiceImpl extends GenericServiceImpl<CollateralItemDetails> implements CollateralItemDetailsService{
}
