package kg.gov.mf.loan.manage.dao.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;

public interface CollateralAgreementDao {

	List<CollateralAgreement> findAll();
	CollateralAgreement findById(long id);
	CollateralAgreement findByAgreementNumber(String agreementNumber);
    void save(CollateralAgreement agreement);
    void deleteById(long id);
	
}
