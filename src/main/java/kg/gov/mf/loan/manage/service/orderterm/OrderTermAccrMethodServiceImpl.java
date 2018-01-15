package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermAccrMethod;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermAccrMethodService")
@Transactional
public class OrderTermAccrMethodServiceImpl extends GenericServiceImpl<OrderTermAccrMethod> implements OrderTermAccrMethodService{
}
