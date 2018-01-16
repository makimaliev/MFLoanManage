package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralInspection;

@Repository("collateralInspectionDao")
public class CollateralInspectionDaoImpl extends GenericDaoImpl<CollateralInspection> implements CollateralInspectionDao{
}
