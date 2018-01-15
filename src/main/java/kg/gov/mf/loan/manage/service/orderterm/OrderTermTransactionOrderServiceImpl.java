package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermTransactionOrderService")
@Transactional
public class OrderTermTransactionOrderServiceImpl extends GenericServiceImpl<OrderTermTransactionOrder> implements OrderTermTransactionOrderService{
}
