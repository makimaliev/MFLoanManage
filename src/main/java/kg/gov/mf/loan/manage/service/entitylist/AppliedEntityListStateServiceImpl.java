package kg.gov.mf.loan.manage.service.entitylist;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("appliedEntityListStateService")
@Transactional
public class AppliedEntityListStateServiceImpl extends GenericServiceImpl<AppliedEntityListState> implements AppliedEntityListStateService {
}
