package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.TargetedUse;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("targetedUseService")
@Transactional
public class TargetedUseServiceImpl extends GenericServiceImpl<TargetedUse> implements TargetedUseService{
}
