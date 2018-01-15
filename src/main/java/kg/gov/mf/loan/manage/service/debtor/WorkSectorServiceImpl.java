package kg.gov.mf.loan.manage.service.debtor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.debtor.WorkSector;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("workSectorService")
@Transactional
public class WorkSectorServiceImpl extends GenericServiceImpl<WorkSector> implements WorkSectorService{
}
