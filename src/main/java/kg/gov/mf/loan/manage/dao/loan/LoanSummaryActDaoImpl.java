package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.loan.LoanSummaryAct;
import kg.gov.mf.loan.manage.util.DateUtils;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("loanSummaryActDao")
public class LoanSummaryActDaoImpl extends GenericDaoImpl<LoanSummaryAct> implements LoanSummaryActDao
{
    @Override
    public List<LoanSummaryAct> getLoanSummaryActByDebtor(Debtor debtor)
    {
        Criteria criteria=getCurrentSession().createCriteria(LoanSummaryAct.class);
        criteria.add(Restrictions.eq("debtor", debtor));
        return criteria.list();
    }

    @Override
    public LoanSummaryAct getById(Long id){

        LoanSummaryAct loanSummaryAct=super.getById(id);

        Hibernate.initialize(loanSummaryAct.getLoanSummaries());
        Hibernate.initialize(loanSummaryAct.getLoanSummaryActState());
        Hibernate.initialize(loanSummaryAct.getDebtor());

        return loanSummaryAct;
    }
}
