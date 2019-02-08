package kg.gov.mf.loan.manage.dao.collateral;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;

@Repository("collateralAgreementDao")
public class CollateralAgreementDaoImpl extends GenericDaoImpl<CollateralAgreement> implements CollateralAgreementDao{

    @Override
    public CollateralAgreement getById(Long id)
    {
        CollateralAgreement result = super.getById(id);
        Hibernate.initialize(result.getOwner());
        Hibernate.initialize(result.getCollateralItems());
        Hibernate.initialize(result.getAdditionalAgreements());
        Hibernate.initialize(result.getLoans());
        Hibernate.initialize(result.getNotary());
        return result;
    }
}
