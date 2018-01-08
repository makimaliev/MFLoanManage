package kg.gov.mf.loan.manage.service.orderdocument;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.orderdocument.OrderDocumentDao;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

@Service("orderDocumentService")
@Transactional
public class OrderDocumentServiceImpl implements OrderDocumentService{
	
	@Autowired
	OrderDocumentDao docDao;

	@Override
	public OrderDocument findById(long id) {
		return this.docDao.findById(id);
	}

	@Override
	public OrderDocument findByName(String name) {
		return this.docDao.findName(name);
	}

	@Override
	public void save(OrderDocument doc) {
		this.docDao.save(doc);
	}

	@Override
	public void update(OrderDocument doc) {
		OrderDocument entity = this.docDao.findById(doc.getId());
		if(entity!=null){
			entity.setName(doc.getName());
			entity.setOrderDocumentType(doc.getOrderDocumentType());
		}
	}

	@Override
	public void deleteById(long id) {
		this.docDao.deleteById(id);
	}

	@Override
	public List<OrderDocument> findAll() {
		return this.docDao.findAll();
	}

}
