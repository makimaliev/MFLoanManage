package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.asset.AssetItemInspection;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("asset")
public class AssetItemInspectionDaoImpl extends GenericDaoImpl<AssetItemInspection> implements AssetItemInspectionDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public AssetItemInspection getById(Long id){

        AssetItemInspection inspection=super.getById(id);
        Hibernate.initialize(inspection.getAssetItem());
        Hibernate.initialize(inspection.getInspectionResultType());
        return inspection;
    }

    @Override
    public List<AssetItemInspection> getByAssetItemId(Long assetItemId) {
        String baseQuery="select *\n" +
                "from asset_item_inspection where assetItemId="+assetItemId;
        Query query=entityManager.createNativeQuery(baseQuery,AssetItemInspection.class);

        return query.getResultList();
    }
}
