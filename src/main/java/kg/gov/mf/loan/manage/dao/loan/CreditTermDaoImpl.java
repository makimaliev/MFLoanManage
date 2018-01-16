package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

@Repository("creditTermDao")
public class CreditTermDaoImpl extends GenericDaoImpl<CreditTerm> implements CreditTermDao{
}
