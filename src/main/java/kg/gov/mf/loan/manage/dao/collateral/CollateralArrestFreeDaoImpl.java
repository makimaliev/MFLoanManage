package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralArrestFree;

@Repository("collateralArrestFreeDao")
public class CollateralArrestFreeDaoImpl extends GenericDaoImpl<CollateralArrestFree> implements CollateralArrestFreeDao{
}
