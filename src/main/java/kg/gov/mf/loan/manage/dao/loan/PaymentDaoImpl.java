package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Payment;
import kg.gov.mf.loan.manage.util.DateUtils;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("paymentDao")
public class PaymentDaoImpl extends GenericDaoImpl<Payment> implements PaymentDao{

    @Override
    public Payment getById(Long id){

        Payment payment=super.getById(id);

        Hibernate.initialize(payment.getPaymentType());
        Hibernate.initialize(payment.getLoan());

        return payment;
    }

    @Override
    public List<Payment> getRowsUntilOnDateByLoanId(Long loanId, Date onDate)
    {
        return getCurrentSession().createQuery("from Payment where loanId ='"+ loanId + "' and paymentDate < '" + DateUtils.format(onDate, DateUtils.FORMAT_POSTGRES_DATE) + "' order by paymentDate").list();
    }

    @Override
    public List<Payment> getFromToDate(Long loanId, Date startDate, Date closeDate) {
        Criteria criteria=getCurrentSession().createCriteria(Payment.class);
        criteria.createAlias("loan", "loan");
        criteria.add(Restrictions.eq("loan.id", loanId));
        criteria.add(Restrictions.between("paymentDate",startDate,closeDate));
        return criteria.list();
    }

    @Override
    public String getPaymentDateAmountNumberById(Long paymentId) {
        Criteria criteria=getCurrentSession().createCriteria(Payment.class);
        criteria.add(Restrictions.eq("id", paymentId));
        Payment payment= (Payment) criteria.uniqueResult();

        return payment.getPaymentDate()+" - "+payment.getTotalAmount()+" - "+payment.getNumber();
    }

    @Override
    public List<Payment> getRowDayBeforeOnDateByLoanId(Long loanId, Date onDate)
    {
        Date date = DateUtils.subtract(onDate, DateUtils.DAY, 1);
        return getCurrentSession().createQuery("from Payment where loanId ='"+ loanId + "' and paymentDate = '" + DateUtils.format(date, DateUtils.FORMAT_POSTGRES_DATE) + "'").list();
    }




}
