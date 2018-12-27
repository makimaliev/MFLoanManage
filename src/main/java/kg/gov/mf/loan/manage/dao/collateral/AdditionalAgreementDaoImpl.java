package kg.gov.mf.loan.manage.dao.collateral;


import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.AdditionalAgreement;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

@Repository("additionalAgreementDao")
public class AdditionalAgreementDaoImpl extends GenericDaoImpl<AdditionalAgreement> implements AdditionalAgreementDao{

    @Override
    public AdditionalAgreement getById(Long id){
        AdditionalAgreement additionalAgreement=super.getById(id);
        Hibernate.initialize(additionalAgreement.getCollateralAgreement());

        return additionalAgreement;
    }
}
