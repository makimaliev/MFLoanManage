package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FloatingRateDaoImpl implements FloatingRateDao {

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
	public void create(FloatingRate floatingRate) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(floatingRate);

		logger.info("FloatingRate added == "+floatingRate);

	}


	@Override
	public void edit(FloatingRate floatingRate) {


		Session session = this.sessionFactory.getCurrentSession();
		session.update(floatingRate);

		logger.info("FloatingRate edited == "+floatingRate);
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


	@Override
	public FloatingRate findById(long id) {

		Session session = this.sessionFactory.getCurrentSession();
		FloatingRate floatingRate = (FloatingRate) session.load(FloatingRate.class, new Long (id));

		logger.info("FloatingRate get by id == "+floatingRate);

		return floatingRate ;
	}



    @SuppressWarnings("unchecked")
    @Override
    public List<FloatingRate> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<FloatingRate> floatingRatesList = session.createQuery("from FloatingRate").list();
        return floatingRatesList;
    }


}