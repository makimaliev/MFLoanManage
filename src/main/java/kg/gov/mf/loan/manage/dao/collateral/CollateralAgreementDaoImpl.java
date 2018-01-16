package kg.gov.mf.loan.manage.dao.collateral;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;

@Repository("collateralAgreementDao")
public class CollateralAgreementDaoImpl extends GenericDaoImpl<CollateralAgreement> implements CollateralAgreementDao{
}
