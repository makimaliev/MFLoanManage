package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.asset.AssetExpense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AssetExpenseDao extends GenericDaoImpl<AssetExpense>{

    @Autowired
    EntityManager entityManager;

    public List<AssetExpense> getByAssetId(Long assetId){
        String baseQuery="select *\n" +
                "from asset_expense where assetId="+assetId;
        Query query=entityManager.createNativeQuery(baseQuery,AssetExpense.class);
        return query.getResultList();
    }
}
