package kg.gov.mf.loan.manage.dao.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FloatingRateDao {

	public void create(FloatingRate floatingRate);

	public void edit(FloatingRate floatingRate);

	public void deleteById(long id);

	public FloatingRate findById(long id);
	
	public List<FloatingRate> findAll();

}
