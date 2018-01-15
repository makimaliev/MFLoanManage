package kg.gov.mf.loan.manage.service.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kg.gov.mf.loan.manage.model.order.CreditOrderState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("creditOrderStateService")
@Transactional
public class CreditOrderStateServiceImpl extends GenericServiceImpl<CreditOrderState> implements CreditOrderStateService{
}
