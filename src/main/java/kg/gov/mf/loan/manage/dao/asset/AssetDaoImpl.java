package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.asset.Asset;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

@Repository("assetDao")
public class AssetDaoImpl extends GenericDaoImpl<Asset> implements AssetDao{

    @Override
    public Asset getById(Long id){
        Asset asset=super.getById(id);
        Hibernate.initialize(asset.getAssetExpenses());
        Hibernate.initialize(asset.getAssetItems());
        Hibernate.initialize(asset.getAssetStatus());
        Hibernate.initialize(asset.getAssetType());
        Hibernate.initialize(asset.getLoanIds());
        Hibernate.initialize(asset.getPaymentIds());
        Hibernate.initialize(asset.getFromDebtorIds());
        Hibernate.initialize(asset.getFromLoanIds());
        Hibernate.initialize(asset.getToDebtorIds());

        return asset;
    }
}
