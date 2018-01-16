package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.InspectionResultType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("inspectionResultTypeService")
@Transactional
public class InspectionResultTypeServiceImpl extends GenericServiceImpl<InspectionResultType> implements InspectionResultTypeService {
}
