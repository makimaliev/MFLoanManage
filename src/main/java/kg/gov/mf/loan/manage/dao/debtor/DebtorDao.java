package kg.gov.mf.loan.manage.dao.debtor;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.debtor.Debtor;

public interface DebtorDao extends GenericDao<Debtor> {

    public Debtor getByOwnerId(Long id);
}
