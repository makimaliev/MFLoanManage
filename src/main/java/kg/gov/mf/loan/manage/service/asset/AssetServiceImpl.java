package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.Asset;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetService")
@Transactional
public class AssetServiceImpl extends GenericServiceImpl<Asset> implements AssetService{
}
