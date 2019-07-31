package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.asset.AssetItem;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("assetItemDao")
public class AssetItemDaoImpl extends GenericDaoImpl<AssetItem> implements AssetItemDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public AssetItem getById(Long id){
        AssetItem assetItem=super.getById(id);
        Hibernate.initialize(assetItem.getOwner());
        Hibernate.initialize(assetItem.getAssetItemDetails());
        Hibernate.initialize(assetItem.getAsset());
        Hibernate.initialize(assetItem.getItemType());
        Hibernate.initialize(assetItem.getQuantityType());
        Hibernate.initialize(assetItem.getAssetItemInspections());
        return assetItem;
    }

    @Override
    public List<AssetItem> getByAssetId(Long assetId) {

        String baseQuery="select *\n" +
                "from asset_item where assetId="+assetId;
        Query query=entityManager.createNativeQuery(baseQuery,AssetItem.class);

        return query.getResultList();
    }
}
