package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;

public interface CollateralAgreementService {

	CollateralAgreement findById(long id);
	CollateralAgreement findByAgreementNumber(String agreementNumber);
	void save(CollateralAgreement agreement);
	void update(CollateralAgreement agreement);
	void deleteById(long id);
	List<CollateralAgreement> findAll();
	
}
