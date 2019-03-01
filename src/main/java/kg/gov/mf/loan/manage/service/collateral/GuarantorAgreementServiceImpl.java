package kg.gov.mf.loan.manage.service.collateral;

import kg.gov.mf.loan.manage.model.collateral.GuarantorAgreement;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("guarantorAgreementService")
@Transactional
public class GuarantorAgreementServiceImpl extends GenericServiceImpl<GuarantorAgreement> implements GuarantorAgreementService{
}
