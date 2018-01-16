package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.LoanGoods;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("loanGoodsService")
@Transactional
public class LoanGoodsServiceImpl extends GenericServiceImpl<LoanGoods> implements LoanGoodsService{
}
