package kg.gov.mf.loan.manage.service.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("creditOrderService")
@Transactional
public class CreditOrderServiceImpl extends GenericServiceImpl<CreditOrder> implements CreditOrderService{
}
