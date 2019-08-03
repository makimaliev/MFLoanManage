package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetExpense;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface AssetExpenseService extends GenericService<AssetExpense> {

    public List<AssetExpense> getByAssetId(Long assetId);
}
