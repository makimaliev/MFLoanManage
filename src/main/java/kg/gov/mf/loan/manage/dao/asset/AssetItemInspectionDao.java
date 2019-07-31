package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.asset.AssetItemInspection;

import java.util.List;

public interface AssetItemInspectionDao extends GenericDao<AssetItemInspection>{

    public List<AssetItemInspection> getByAssetItemId(Long assetItemId);
}
