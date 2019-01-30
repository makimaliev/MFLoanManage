package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.util.DateUtils;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.CreditTerm;

import java.util.Date;

@Repository("creditTermDao")
public class CreditTermDaoImpl extends GenericDaoImpl<CreditTerm> implements CreditTermDao{

    @Override
    public CreditTerm getRecentTermByLoanIdAndOnDate(long loanId, Date onDate)
    {
        Query query = getCurrentSession().createQuery("from CreditTerm where record_status = 1 AND loanId = '" + loanId + "' and startDate <= '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' order by startDate DESC");
        query.setMaxResults(1);

        CreditTerm creditTerm=(CreditTerm) query.uniqueResult();

        Hibernate.initialize(creditTerm.getDaysInMonthMethod());
        Hibernate.initialize(creditTerm.getFloatingRateType());
        Hibernate.initialize(creditTerm.getRatePeriod());
        Hibernate.initialize(creditTerm.getTransactionOrder());
        Hibernate.initialize(creditTerm.getPenaltyOnPrincipleOverdueRateValue());
        Hibernate.initialize(creditTerm.getPenaltyOnPrincipleOverdueRateType());
        Hibernate.initialize(creditTerm.getDaysInYearMethod());
        Hibernate.initialize(creditTerm.getDaysInMonthMethod());


        return creditTerm;

    }
    @Override
    public CreditTerm getById(Long id){

        CreditTerm creditTerm=super.getById(id);

        Hibernate.initialize(creditTerm.getDaysInMonthMethod());
        Hibernate.initialize(creditTerm.getFloatingRateType());
        Hibernate.initialize(creditTerm.getRatePeriod());
        Hibernate.initialize(creditTerm.getTransactionOrder());
        Hibernate.initialize(creditTerm.getPenaltyOnPrincipleOverdueRateValue());
        Hibernate.initialize(creditTerm.getPenaltyOnPrincipleOverdueRateType());
        Hibernate.initialize(creditTerm.getDaysInYearMethod());
        Hibernate.initialize(creditTerm.getDaysInMonthMethod());


        return creditTerm;
    }
}
