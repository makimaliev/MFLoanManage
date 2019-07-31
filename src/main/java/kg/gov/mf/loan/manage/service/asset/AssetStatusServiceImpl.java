package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.model.asset.AssetStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assetStatusService")
@Transactional
public class AssetStatusServiceImpl extends GenericServiceImpl<AssetStatus> implements AssetStatusService{
}
