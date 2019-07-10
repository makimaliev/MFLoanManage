package kg.gov.mf.loan.manage.service.collection;

import kg.gov.mf.loan.manage.dao.collection.PhaseDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.PhaseDetails;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("phaseDetailsService")
@Transactional
public class PhaseDetailsServiceImpl extends GenericServiceImpl<PhaseDetails> implements PhaseDetailsService {

    @Autowired
    PhaseDetailsDao phaseDetailsDao;

    @Override
    public PhaseDetails findByPhaseIdAndLoanId(Long phaseId, Long loanId) {

        return phaseDetailsDao.findByPhaseIdAndLoanId(phaseId,loanId);
    }
}
