package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetTypeService")
@Transactional
public class AssetTypeServiceImpl extends GenericServiceImpl<AssetType> implements AssetTypeService{
}
