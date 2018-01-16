package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralItem;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralItemService")
@Transactional
public class CollateralItemServiceImpl extends GenericServiceImpl<CollateralItem> implements CollateralItemService {
}
