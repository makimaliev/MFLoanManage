package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.PhaseStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("phaseStatusService")
@Transactional
public class PhaseStatusServiceImpl extends GenericServiceImpl<PhaseStatus> implements PhaseStatusService {
}
