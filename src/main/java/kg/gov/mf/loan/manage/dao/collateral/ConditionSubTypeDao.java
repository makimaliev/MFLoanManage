package kg.gov.mf.loan.manage.dao.collateral;


import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collateral.ConditionSubType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ConditionSubTypeDao extends GenericDaoImpl<ConditionSubType> {

    @PersistenceContext
    EntityManager entityManager;

    public List<ConditionSubType> getByConditionTypeId(Long conditionTypeId){

        String baseQuery = "select *\n" +
                "from conditionSubType where conditionTypeId="+conditionTypeId;

        Query query = entityManager.createNativeQuery(baseQuery, ConditionSubType.class);

        return query.getResultList();
    }
}
