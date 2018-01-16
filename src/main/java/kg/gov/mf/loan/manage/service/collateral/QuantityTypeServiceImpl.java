package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.QuantityType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("quantityTypeService")
@Transactional
public class QuantityTypeServiceImpl extends GenericServiceImpl<QuantityType> implements QuantityTypeService{
}
