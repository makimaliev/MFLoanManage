package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermRatePeriodService")
@Transactional
public class OrderTermRatePeriodServiceImpl extends GenericServiceImpl<OrderTermRatePeriod> implements OrderTermRatePeriodService{
}
