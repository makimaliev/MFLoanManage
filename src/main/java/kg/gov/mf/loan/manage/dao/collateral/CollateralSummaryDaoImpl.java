package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralSummary;

@Repository("collateralSummaryDao")
public class CollateralSummaryDaoImpl extends GenericDaoImpl<CollateralSummary> implements CollateralSummaryDao{
}
