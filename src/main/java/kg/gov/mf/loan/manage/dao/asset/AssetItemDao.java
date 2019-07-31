package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.asset.AssetItem;

import java.util.List;

public interface AssetItemDao extends GenericDao<AssetItem> {

    public List<AssetItem> getByAssetId(Long assetId);
}
