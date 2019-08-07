package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.Asset;
import kg.gov.mf.loan.manage.service.GenericService;

public interface AssetService extends GenericService<Asset> {

    public String getFromDebtorNames(Long assetId);
    public String getToDebtorNames(Long assetId);
}
