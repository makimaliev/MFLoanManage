package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralAgreementDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;

@Service("collateralAgreementService")
@Transactional
public class CollateralAgreementServiceImpl implements CollateralAgreementService {

	@Autowired
	private CollateralAgreementDao agreementDao;

	@Override
	public CollateralAgreement findById(long id) {
		return this.agreementDao.findById(id);
	}

	@Override
	public CollateralAgreement findByAgreementNumber(String agreementNumber) {
		return this.agreementDao.findByAgreementNumber(agreementNumber);
	}

	@Override
	public void save(CollateralAgreement agreement) {
		this.agreementDao.save(agreement);
	}

	@Override
	public void update(CollateralAgreement agreement) {
		CollateralAgreement entity = this.agreementDao.findById(agreement.getId());
        if(entity!=null){
        	entity.setAgreementNumber(agreement.getAgreementNumber());
        	entity.setAgreementDate(agreement.getAgreementDate());
        	entity.setCollateralOfficeRegNumber(agreement.getCollateralOfficeRegNumber());
        	entity.setCollateralOfficeRegDate(agreement.getCollateralOfficeRegDate());
        	entity.setNotaryOfficeRegNumber(agreement.getNotaryOfficeRegNumber());
        	entity.setNotaryOfficeRegDate(agreement.getNotaryOfficeRegDate());
        	entity.setArrestRegNumber(agreement.getArrestRegNumber());
        	entity.setArrestRegDate(agreement.getArrestRegDate());
        }
	}

	@Override
	public void deleteById(long id) {
		this.agreementDao.deleteById(id);
	}

	@Override
	public List<CollateralAgreement> findAll() {
		return this.agreementDao.findAll();
	}

}
