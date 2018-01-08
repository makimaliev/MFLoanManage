package kg.gov.mf.loan.manage.service.orderdocumentpackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderdocumentpackage.OrderDocumentPackageDao;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

@Service("orderDocumentPackageService")
@Transactional
public class OrderDocumentPackageServiceImpl implements OrderDocumentPackageService{
	
	@Autowired
	private OrderDocumentPackageDao packageDao;

	@Override
	public OrderDocumentPackage findById(long id) {
		return this.packageDao.findById(id);
	}

	@Override
	public OrderDocumentPackage findByName(String name) {
		return this.packageDao.findByName(name);
	}

	@Override
	public void save(OrderDocumentPackage oDP) {
		this.packageDao.save(oDP);
	}

	@Override
	public void update(OrderDocumentPackage oDP) {
		OrderDocumentPackage entity = this.packageDao.findById(oDP.getId());
        if(entity!=null){
        	entity.setName(oDP.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.packageDao.deleteById(id);
	}

	@Override
	public List<OrderDocumentPackage> findAll() {
		return this.packageDao.findAll();
	}

}
