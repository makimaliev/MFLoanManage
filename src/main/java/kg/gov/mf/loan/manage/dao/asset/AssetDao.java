package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.asset.Asset;

public interface AssetDao extends GenericDao<Asset> {

    public String getFromDebtorNames(Long assetId);
    public String getToDebtorNames(Long assetId);
}
