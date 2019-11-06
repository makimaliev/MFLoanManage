package kg.gov.mf.loan.manage.service.collateral;

import kg.gov.mf.loan.manage.dao.collateral.ConditionSubTypeDao;
import kg.gov.mf.loan.manage.model.collateral.ConditionSubType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("conditionSubTypeService")
@Transactional
public class ConditionSubTypeServiceImpl extends GenericServiceImpl<ConditionSubType> implements ConditionSubTypeService{

    @Autowired
    ConditionSubTypeDao conditionSubTypeDao;

    @Override
    public List<ConditionSubType> getByConditionTypeId(Long conditionTypeId) {
        return conditionSubTypeDao.getByConditionTypeId(conditionTypeId);
    }
}
