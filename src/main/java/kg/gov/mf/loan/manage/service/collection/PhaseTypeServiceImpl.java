package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.PhaseType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("phaseTypeService")
@Transactional
public class PhaseTypeServiceImpl extends GenericServiceImpl<PhaseType> implements PhaseTypeService {
}
