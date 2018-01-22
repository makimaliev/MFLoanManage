package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.PhaseDetails;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("phaseDetailsService")
@Transactional
public class PhaseDetailsServiceImpl extends GenericServiceImpl<PhaseDetails> implements PhaseDetailsService {
}
