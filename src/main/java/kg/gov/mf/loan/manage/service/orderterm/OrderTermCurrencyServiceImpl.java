package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermCurrencyService")
@Transactional
public class OrderTermCurrencyServiceImpl extends GenericServiceImpl<OrderTermCurrency> implements OrderTermCurrencyService{
}
