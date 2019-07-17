package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import org.springframework.stereotype.Repository;

@Repository
public interface FloatingRateDao extends GenericDao<FloatingRate> {

	public void deleteById(long id);


}
