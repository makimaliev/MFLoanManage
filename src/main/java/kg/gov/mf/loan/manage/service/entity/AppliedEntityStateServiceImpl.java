package kg.gov.mf.loan.manage.service.entity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entity.AppliedEntityState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("appliedEntityStateService")
@Transactional
public class AppliedEntityStateServiceImpl extends GenericServiceImpl<AppliedEntityState> implements AppliedEntityStateService{
}
