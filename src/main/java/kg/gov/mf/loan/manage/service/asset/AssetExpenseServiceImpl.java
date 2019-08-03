package kg.gov.mf.loan.manage.service.asset;

import kg.gov.mf.loan.manage.dao.asset.AssetExpenseDao;
import kg.gov.mf.loan.manage.model.asset.AssetExpense;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("assetExpenseService")
@Transactional
public class AssetExpenseServiceImpl extends GenericServiceImpl<AssetExpense> implements AssetExpenseService{

    @Autowired
    AssetExpenseDao assetExpenseDao;

    @Override
    public List<AssetExpense> getByAssetId(Long assetId) {
        return assetExpenseDao.getByAssetId(assetId);
    }
}
