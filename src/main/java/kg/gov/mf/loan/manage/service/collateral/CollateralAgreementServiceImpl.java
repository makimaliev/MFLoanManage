package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("collateralAgreementService")
@Transactional
public class CollateralAgreementServiceImpl extends GenericServiceImpl<CollateralAgreement> implements CollateralAgreementService {
}
