package kg.gov.mf.loan.manage.service.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kg.gov.mf.loan.manage.model.order.CreditOrderType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("creditOrderTypeService")
@Transactional
public class CreditOrderTypeServiceImpl extends GenericServiceImpl<CreditOrderType> implements CreditOrderTypeService{
	
}
