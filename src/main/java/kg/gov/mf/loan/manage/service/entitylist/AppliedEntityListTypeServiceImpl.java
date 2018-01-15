package kg.gov.mf.loan.manage.service.entitylist;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityListType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("appliedEntityListTypeService")
@Transactional
public class AppliedEntityListTypeServiceImpl extends GenericServiceImpl<AppliedEntityListType> implements AppliedEntityListTypeService {
}
