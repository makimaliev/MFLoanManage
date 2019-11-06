package kg.gov.mf.loan.manage.service.collateral;

import kg.gov.mf.loan.manage.model.collateral.ConditionSubType;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface ConditionSubTypeService extends GenericService<ConditionSubType> {
    public List<ConditionSubType> getByConditionTypeId(Long conditionTypeId);
}
