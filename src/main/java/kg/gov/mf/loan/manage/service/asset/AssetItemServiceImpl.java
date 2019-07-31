package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.dao.asset.AssetItemDao;
import kg.gov.mf.loan.manage.model.asset.AssetItem;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("assetItemService")
@Transactional
public class AssetItemServiceImpl extends GenericServiceImpl<AssetItem> implements AssetItemService{

    @Autowired
    AssetItemDao assetItemDao;

    @Override
    public List<AssetItem> getByAssetId(Long assetId) {
        return assetItemDao.getByAssetId(assetId);
    }
}
