package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class CurrencyRateDaoImpl extends GenericDaoImpl<CurrencyRate> implements CurrencyRateDao {

    private static final Logger logger = LoggerFactory.getLogger(CurrencyRateDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }


    @Autowired
    public CurrencyRateDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public void deleteById(long id) {
		
		Session session = this.sessionFactory.getCurrentSession();
		CurrencyRate currencyRate = (CurrencyRate) session.load(CurrencyRate.class, new Long (id));
		if(currencyRate!=null)
		{
			session.delete(currencyRate);
		}
		
		logger.info("CurrencyRate deleted == "+currencyRate);
		
	}

	@Override
	public CurrencyRate findByDateAndType(Date date, OrderTermCurrency type) {

		Session session = this.sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(CurrencyRate.class);

		criteria.add(Restrictions.lt("date",date));
		criteria.add(Restrictions.eq("currency",type));

		criteria.addOrder(Order.desc("date"));
		criteria.setMaxResults(1);

		CurrencyRate currencyRate = (CurrencyRate) criteria.list().get(0);

		return currencyRate ;
	}
}