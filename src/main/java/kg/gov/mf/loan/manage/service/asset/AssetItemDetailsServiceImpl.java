package kg.gov.mf.loan.manage.service.asset;


import kg.gov.mf.loan.manage.model.asset.AssetItemDetails;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetItemDetailsService")
@Transactional
public class AssetItemDetailsServiceImpl extends GenericServiceImpl<AssetItemDetails> implements AssetItemDetailsService{
}
