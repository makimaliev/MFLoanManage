package kg.gov.mf.loan.manage.dao.collateral;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralItem;

@Repository("collateralItemDao")
public class CollateralItemDaoImpl extends GenericDaoImpl<CollateralItem> implements CollateralItemDao{

    @Override
    public CollateralItem getById(Long id)
    {
        CollateralItem result = super.getById(id);
        Hibernate.initialize(result.getItemType());
        Hibernate.initialize(result.getQuantityType());
        Hibernate.initialize(result.getConditionType());
        Hibernate.initialize(result.getCollateralItemDetails());
        Hibernate.initialize(result.getCollateralItemArrestFree());
        Hibernate.initialize(result.getCollateralAgreement());
        Hibernate.initialize(result.getOwner());
        return result;
    }

}
