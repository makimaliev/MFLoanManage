package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.ProcedureType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("procedureTypeService")
@Transactional
public class ProcedureTypeServiceImpl extends GenericServiceImpl<ProcedureType> implements ProcedureTypeService {
	

}
