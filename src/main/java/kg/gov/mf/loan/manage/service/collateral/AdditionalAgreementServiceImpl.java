package kg.gov.mf.loan.manage.service.collateral;

import kg.gov.mf.loan.manage.model.collateral.AdditionalAgreement;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("additionalAgreementService")
@Transactional
public class AdditionalAgreementServiceImpl extends GenericServiceImpl<AdditionalAgreement> implements AdditionalAgreementService{
}
