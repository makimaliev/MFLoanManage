package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermService")
@Transactional
public class OrderTermServiceImpl extends GenericServiceImpl<OrderTerm> implements OrderTermService{
}
