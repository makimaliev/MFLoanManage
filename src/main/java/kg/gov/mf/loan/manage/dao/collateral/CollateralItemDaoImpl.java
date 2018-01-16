package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralItem;

@Repository("collateralItemDao")
public class CollateralItemDaoImpl extends GenericDaoImpl<CollateralItem> implements CollateralItemDao{
}
