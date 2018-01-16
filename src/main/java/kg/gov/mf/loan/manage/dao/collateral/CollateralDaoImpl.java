package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.Collateral;

@Repository("collateralDao")
public class CollateralDaoImpl extends GenericDaoImpl<Collateral> implements CollateralDao{
}
