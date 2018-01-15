package kg.gov.mf.loan.manage.service.entitylist;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("appliedEntityListService")
@Transactional
public class AppliedEntityListServiceImpl extends GenericServiceImpl<AppliedEntityList> implements AppliedEntityListService{
}
