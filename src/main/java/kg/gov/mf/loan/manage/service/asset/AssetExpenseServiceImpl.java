package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetExpense;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetExpenseService")
@Transactional
public class AssetExpenseServiceImpl extends GenericServiceImpl<AssetExpense> implements AssetExpenseService{
}
