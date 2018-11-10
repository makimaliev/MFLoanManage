package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.GoodType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("goodTypeService")
@Transactional
public class GoodTypeServiceImpl extends GenericServiceImpl<GoodType> implements GoodTypeService{
}
