package kg.gov.mf.loan.manage.service.entity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.entity.AppliedEntity;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("appliedEntityService")
@Transactional
public class AppliedEntityServiceImpl extends GenericServiceImpl<AppliedEntity> implements AppliedEntityService{
}
