package kg.gov.mf.loan.manage.service.collateral;

import kg.gov.mf.loan.manage.model.collateral.ArrestFreeStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("arrestFreeStatus")
@Transactional
public class ArrestFreeStatusServiceImpl extends GenericServiceImpl<ArrestFreeStatus> implements ArrestFreeStatusService{
}
