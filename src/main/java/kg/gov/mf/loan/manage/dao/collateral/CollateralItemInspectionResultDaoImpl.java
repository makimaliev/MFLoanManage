package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralItemInspectionResult;

@Repository("collateralItemInspectionResultDao")
public class CollateralItemInspectionResultDaoImpl extends GenericDaoImpl<CollateralItemInspectionResult> implements CollateralItemInspectionResultDao{
}
