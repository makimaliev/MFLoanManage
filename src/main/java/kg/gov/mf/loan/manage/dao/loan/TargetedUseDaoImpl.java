package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.TargetedUse;

@Repository("targetedUseDao")
public class TargetedUseDaoImpl extends GenericDaoImpl<TargetedUse> implements TargetedUseDao {
}
