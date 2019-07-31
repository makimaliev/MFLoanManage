package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.dao.asset.AssetItemInspectionDao;
import kg.gov.mf.loan.manage.model.asset.AssetItemInspection;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("assetItemInspectionService")
@Transactional
public class AssetItemInspectionServiceImpl extends GenericServiceImpl<AssetItemInspection> implements AssetItemInspectionService{

    @Autowired
    AssetItemInspectionDao assetItemInspectionDao;

    @Override
    public List<AssetItemInspection> getByAssetItemId(Long assetItemId) {
        return assetItemInspectionDao.getByAssetItemId(assetItemId);
    }
}
