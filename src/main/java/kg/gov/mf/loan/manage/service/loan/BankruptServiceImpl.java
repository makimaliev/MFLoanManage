package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.Bankrupt;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("bankruptService")
@Transactional
public class BankruptServiceImpl extends GenericServiceImpl<Bankrupt> implements BankruptService{
}
