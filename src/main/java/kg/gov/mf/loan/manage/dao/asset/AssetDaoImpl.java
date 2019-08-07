package kg.gov.mf.loan.manage.dao.asset;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.asset.Asset;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("assetDao")
public class AssetDaoImpl extends GenericDaoImpl<Asset> implements AssetDao{

    @Autowired
    EntityManager entityManager;

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

    @Override
    public String getFromDebtorNames(Long assetId) {
        Asset asset=this.getById(assetId);
        String debtorIds="";
        for (Long debtorId:asset.getFromDebtorIds()){
            if(debtorIds.equals("")){
                debtorIds= String.valueOf(debtorId);
            }
            else{
                debtorIds=debtorIds+","+debtorId;
            }
        }
        String debtorNames="";
        if(!debtorIds.equals("")){
            String getDebtorName="select name\n" +
                    "from debtor where id in ("+debtorIds+")";
            Query query=entityManager.createNativeQuery(getDebtorName);
            List<String> names=query.getResultList();
            for (String name:names){
                if(debtorNames.equals("")){
                    debtorNames=name;
                }
                else{
                    debtorNames=debtorNames+","+name;
                }
            }
        }
        return debtorNames;
    }

    @Override
    public String getToDebtorNames(Long assetId) {

        Asset asset=this.getById(assetId);
        String debtorIds="";
        for (Long debtorId:asset.getToDebtorIds()){
            if(debtorIds.equals("")){
                debtorIds= String.valueOf(debtorId);
            }
            else{
                debtorIds=debtorIds+","+debtorId;
            }
        }
        String debtorNames="";
        if(!debtorIds.equals("")){
            String getDebtorName="select name\n" +
                    "from debtor where id in ("+debtorIds+")";
            Query query=entityManager.createNativeQuery(getDebtorName);
            List<String> names=query.getResultList();
            for (String name:names){
                if(debtorNames.equals("")){
                    debtorNames=name;
                }
                else{
                    debtorNames=debtorNames+","+name;
                }
            }
        }
        return debtorNames;
    }
}
