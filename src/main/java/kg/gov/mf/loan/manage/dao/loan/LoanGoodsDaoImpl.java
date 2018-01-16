package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.LoanGoods;

@Repository("loanGoodsDao")
public class LoanGoodsDaoImpl extends GenericDaoImpl<LoanGoods> implements LoanGoodsDao{
}
