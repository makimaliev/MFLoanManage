package kg.gov.mf.loan.manage.service.collateral;

import kg.gov.mf.loan.manage.model.collateral.InspectionStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("inspectionStatusService")
@Transactional
public class InspectionStatusServiceImpl extends GenericServiceImpl<InspectionStatus> implements InspectionStatusService{
}
