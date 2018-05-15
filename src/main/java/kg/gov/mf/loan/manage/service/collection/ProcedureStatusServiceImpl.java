package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.ProcedureStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("procedureStatusService")
@Transactional
public class ProcedureStatusServiceImpl extends GenericServiceImpl<ProcedureStatus> implements ProcedureStatusService{
}
