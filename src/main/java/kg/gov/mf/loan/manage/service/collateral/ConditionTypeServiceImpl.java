package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.ConditionType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("conditionTypeService")
@Transactional
public class ConditionTypeServiceImpl extends GenericServiceImpl<ConditionType> implements ConditionTypeService{
}
