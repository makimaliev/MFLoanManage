package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetItem;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface AssetItemService extends GenericService<AssetItem>{

    public List<AssetItem> getByAssetId(Long assetId);
}
