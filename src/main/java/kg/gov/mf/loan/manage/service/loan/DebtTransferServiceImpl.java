package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.DebtTransfer;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("debtTransferService")
@Transactional
public class DebtTransferServiceImpl extends GenericServiceImpl<DebtTransfer> implements DebtTransferService{
}
