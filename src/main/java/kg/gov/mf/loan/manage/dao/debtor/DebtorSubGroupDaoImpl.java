package kg.gov.mf.loan.manage.dao.debtor;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.DebtorSubGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("debtorSubGroupDao")
public class DebtorSubGroupDaoImpl extends GenericDaoImpl<DebtorSubGroup> implements DebtorSubGroupDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<DebtorSubGroup> getByDebtorGroup(Long debtorGroupId) {
        String queryStr = "select *\n" +
                "from debtorSubGroup where debtorGroupId="+debtorGroupId;
        Query query = entityManager.createNativeQuery(queryStr,DebtorSubGroup.class);

        return query.getResultList();
    }
}
