package kg.gov.mf.loan.manage.dao.collateral;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.GuarantorAgreement;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

@Repository("guarantoragreementDao")
public class GuarantorAgreementDaoImpl extends GenericDaoImpl<GuarantorAgreement> implements GuarantorAgreementDao{

    @Override
    public GuarantorAgreement getById(Long id)
    {
        GuarantorAgreement result = super.getById(id);
        Hibernate.initialize(result.getOwner());
        Hibernate.initialize(result.getLoans());
        Hibernate.initialize(result.getNotary());
        return result;
    }
}
