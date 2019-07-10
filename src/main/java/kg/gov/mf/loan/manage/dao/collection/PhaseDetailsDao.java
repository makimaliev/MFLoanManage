package kg.gov.mf.loan.manage.dao.collection;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.collection.PhaseDetails;

public interface PhaseDetailsDao extends GenericDao<PhaseDetails> {
    public PhaseDetails findByPhaseIdAndLoanId(Long phaseId,Long loanId);
}
