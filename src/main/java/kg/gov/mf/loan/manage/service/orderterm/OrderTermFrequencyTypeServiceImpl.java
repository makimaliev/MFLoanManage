package kg.gov.mf.loan.manage.service.orderterm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFrequencyType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("orderTermFrequencyTypeService")
@Transactional
public class OrderTermFrequencyTypeServiceImpl extends GenericServiceImpl<OrderTermFrequencyType> implements OrderTermFrequencyTypeService{
}
