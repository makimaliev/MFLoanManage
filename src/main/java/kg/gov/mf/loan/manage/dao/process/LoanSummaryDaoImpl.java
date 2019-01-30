package kg.gov.mf.loan.manage.dao.process;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.util.DateUtils;
import kg.gov.mf.loan.manage.model.process.LoanSummary;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Repository("loanSummaryDao")
public class LoanSummaryDaoImpl extends GenericDaoImpl<LoanSummary> implements LoanSummaryDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public LoanSummary getByOnDateAndLoanId(Date onDate, long loanId){
        String baseQuery="select * from loanSummary where onDate = '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' and loanId = '" + loanId + "' order by id desc";
        Query query=entityManager.createNativeQuery(baseQuery,LoanSummary.class);
        query.setMaxResults(1);
        LoanSummary loanSummary= (LoanSummary) query.getSingleResult();
//        LoanSummary loanSummary= (LoanSummary) getCurrentSession().createCriteria(baseQuery).setMaxResults(1);
//        LoanSummary loanSummary= (LoanSummary) getCurrentSession().createQuery("from LoanSummary where onDate = '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' and loanId = '" + loanId + "' order by id desc").setMaxResults(1);
        Hibernate.initialize(loanSummary.getLoan());
        Hibernate.initialize(loanSummary.getLoanSummaryType());

        return loanSummary;
    }

    @Override
    public List<LoanSummary> getSummariesByOnDateAndLoanId(Date onDate, long loanId) {
        String baseQuery="select * from loanSummary where loanId="+loanId+" and onDate=\""+onDate+"\"";
        Query query=entityManager.createNativeQuery(baseQuery,LoanSummary.class);

        return query.getResultList();
    }

    @Override
    public LoanSummary getById(Long id)
    {
        LoanSummary result = super.getById(id);
        Hibernate.initialize(result.getLoan());
        return result;
    }

}
