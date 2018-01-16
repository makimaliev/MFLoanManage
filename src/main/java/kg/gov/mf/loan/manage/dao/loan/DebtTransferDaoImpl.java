package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.DebtTransfer;

@Repository("debtTransferDao")
public class DebtTransferDaoImpl extends GenericDaoImpl<DebtTransfer> implements DebtTransferDao{
}
