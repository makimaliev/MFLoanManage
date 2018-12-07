package kg.gov.mf.loan.manage.dao.loan;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.LoanGoods;

@Repository("loanGoodsDao")
public class LoanGoodsDaoImpl extends GenericDaoImpl<LoanGoods> implements LoanGoodsDao{

    @Override
    public LoanGoods getById(Long id){

        LoanGoods loanGoods=super.getById(id);

        Hibernate.initialize(loanGoods.getGoodType());
        Hibernate.initialize(loanGoods.getQuantityType());

        return loanGoods;
    }
}
