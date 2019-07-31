package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetItemInspection;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface AssetItemInspectionService extends GenericService<AssetItemInspection>{

    public List<AssetItemInspection> getByAssetItemId(Long assetItemId);
}
