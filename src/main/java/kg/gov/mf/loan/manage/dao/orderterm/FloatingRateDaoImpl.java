package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FloatingRateDaoImpl extends GenericDaoImpl<FloatingRate> implements FloatingRateDao {

    private static final Logger logger = LoggerFactory.getLogger(FloatingRateDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }


    @Autowired
    public FloatingRateDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public void deleteById(long id) {

		Session session = this.sessionFactory.getCurrentSession();
		FloatingRate floatingRate = (FloatingRate) session.load(FloatingRate.class, new Long (id));
		if(floatingRate!=null)
		{
			session.delete(floatingRate);
		}

		logger.info("FloatingRate deleted == "+floatingRate);

	}
}