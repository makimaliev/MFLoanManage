package kg.gov.mf.loan.manage.service.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.FloatingRate;
import kg.gov.mf.loan.manage.service.GenericService;

import java.util.List;

public interface FloatingRateService extends GenericService<FloatingRate> {



	public void create(FloatingRate floatingRate);

	public void edit(FloatingRate floatingRate);

	public void deleteById(long id);

	public FloatingRate findById(long id);
	
	public List<FloatingRate> findAll();
}
