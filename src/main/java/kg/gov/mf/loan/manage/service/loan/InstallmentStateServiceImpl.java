package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.InstallmentState;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("installmentStateService")
@Transactional
public class InstallmentStateServiceImpl extends GenericServiceImpl<InstallmentState> implements InstallmentStateService{
}
