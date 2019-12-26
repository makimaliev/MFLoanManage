package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetExpenseType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetExpenseTypeService")
@Transactional
public class AssetExpenseTypeServiceImpl extends GenericServiceImpl<AssetExpenseType> implements AssetExpenseTypeService{
}
