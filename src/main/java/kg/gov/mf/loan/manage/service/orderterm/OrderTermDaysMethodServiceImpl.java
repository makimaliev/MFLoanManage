package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermDaysMethodService")
@Transactional
public class OrderTermDaysMethodServiceImpl extends GenericServiceImpl<OrderTermDaysMethod> implements OrderTermDaysMethodService{
}
