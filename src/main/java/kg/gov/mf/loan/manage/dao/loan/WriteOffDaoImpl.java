package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.WriteOff;

@Repository("writeOffDao")
public class WriteOffDaoImpl extends GenericDaoImpl<WriteOff> implements WriteOffDao{

}
