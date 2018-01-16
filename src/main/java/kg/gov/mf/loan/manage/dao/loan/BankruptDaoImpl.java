package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Bankrupt;

@Repository("bankruptDao")
public class BankruptDaoImpl extends GenericDaoImpl<Bankrupt> implements BankruptDao {
}
