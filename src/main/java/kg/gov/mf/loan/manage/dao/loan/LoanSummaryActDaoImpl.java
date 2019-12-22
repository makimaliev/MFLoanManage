package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.loan.LoanSummaryAct;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("loanSummaryActDao")
public class LoanSummaryActDaoImpl extends GenericDaoImpl<LoanSummaryAct> implements LoanSummaryActDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<LoanSummaryAct> getLoanSummaryActByDebtor(Debtor debtor)
    {
        Criteria criteria=getCurrentSession().createCriteria(LoanSummaryAct.class);
        criteria.add(Restrictions.eq("debtor", debtor));
        return criteria.list();
    }

    @Override
    public boolean isUneque(String reg_number) {

        String checkQuery = "select if(COUNT(*)>0,'false','true')\n" +
                "from loanSummaryAct where reg_number='"+reg_number+"'";
        Query query = entityManager.createNativeQuery(checkQuery);


        return query.getSingleResult().equals("true");
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
