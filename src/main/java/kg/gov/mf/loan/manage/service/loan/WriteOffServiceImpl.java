package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.WriteOff;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("writeOffService")
@Transactional
public class WriteOffServiceImpl extends GenericServiceImpl<WriteOff> implements WriteOffService{
}
