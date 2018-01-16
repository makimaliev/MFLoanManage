package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemDetails;

@Repository("collateralItemDetailsDao")
public class CollateralItemDetailsDaoImpl extends GenericDaoImpl<CollateralItemDetails> implements CollateralItemDetailsDao{
}
