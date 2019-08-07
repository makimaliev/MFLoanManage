package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.dao.asset.AssetDao;
import kg.gov.mf.loan.manage.model.asset.Asset;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetService")
@Transactional
public class AssetServiceImpl extends GenericServiceImpl<Asset> implements AssetService{

    @Autowired
    AssetDao assetDao;

    @Override
    public String getFromDebtorNames(Long assetId) {
        return assetDao.getFromDebtorNames(assetId);
    }

    @Override
    public String getToDebtorNames(Long assetId) {
        return assetDao.getToDebtorNames(assetId);
    }
}
