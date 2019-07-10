package kg.gov.mf.loan.manage.dao.collection;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.PhaseDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository("phaseDetailsDao")
public class PhaseDetailsDaoImpl extends GenericDaoImpl<PhaseDetails> implements PhaseDetailsDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public PhaseDetails findByPhaseIdAndLoanId(Long phaseId, Long loanId) {
        String phaseDetailsQuery="select *\n" +
                "from phaseDetails where loan_id="+loanId+" and collectionPhaseId="+phaseId;
        Query query=entityManager.createNativeQuery(phaseDetailsQuery,PhaseDetails.class);
        PhaseDetails details= (PhaseDetails) query.getSingleResult();
        return details;
    }
}
