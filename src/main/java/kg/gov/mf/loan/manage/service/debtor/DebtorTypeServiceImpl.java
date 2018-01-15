package kg.gov.mf.loan.manage.service.debtor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.debtor.DebtorType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("debtorTypeService")
@Transactional
public class DebtorTypeServiceImpl extends GenericServiceImpl<DebtorType> implements DebtorTypeService{
}
