package kg.gov.mf.loan.manage.service.debtor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("debtorOwnerService")
@Transactional
public class OwnerServiceImpl extends GenericServiceImpl<Owner> implements OwnerService{

}
