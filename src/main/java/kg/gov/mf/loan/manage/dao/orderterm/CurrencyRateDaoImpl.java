package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CurrencyRateDaoImpl implements CurrencyRateDao {

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
	public void create(CurrencyRate currencyRate) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(currencyRate);
		
		logger.info("CurrencyRate added == "+currencyRate);
		
	} 


	@Override
	public void edit(CurrencyRate currencyRate) {
		
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(currencyRate);
		
		logger.info("CurrencyRate edited == "+currencyRate);
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
	public CurrencyRate findById(long id) {
		
		Session session = this.sessionFactory.getCurrentSession();
		CurrencyRate currencyRate = (CurrencyRate) session.load(CurrencyRate.class, new Long (id));
		
		logger.info("CurrencyRate get by id == "+currencyRate);

		return currencyRate ;
	}


	
    @SuppressWarnings("unchecked")
    @Override
    public List<CurrencyRate> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<CurrencyRate> currencyRatesList = session.createQuery("from CurrencyRate").list();
        return currencyRatesList;
    }
 

}