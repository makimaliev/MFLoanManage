package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermFloatingRateTypeService")
@Transactional
public class OrderTermFloatingRateTypeServiceImpl extends GenericServiceImpl<OrderTermFloatingRateType> implements OrderTermFloatingRateTypeService{
}
