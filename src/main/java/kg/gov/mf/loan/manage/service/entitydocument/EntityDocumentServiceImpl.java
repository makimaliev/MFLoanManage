package kg.gov.mf.loan.manage.service.entitydocument;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entitydocument.EntityDocumentDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;

@Service("entityDocumentService")
@Transactional
public class EntityDocumentServiceImpl implements EntityDocumentService {
	
	@Autowired
	private EntityDocumentDao docDao;

	@Override
	public EntityDocument findById(long id) {
		return this.docDao.findById(id);
	}
	
	@Override
	public EntityDocument findByName(String name) {
		return this.docDao.findByName(name);
	}
	
	@Override
	public EntityDocument findByRegisteredNumber(String rNumber) {
		return this.docDao.findByRegNumber(rNumber);
	}

	@Override
	public void save(EntityDocument doc) {
		this.docDao.save(doc);
	}

	@Override
	public void update(EntityDocument doc) {
		EntityDocument entity = this.docDao.findById(doc.getId());
        if(entity!=null){
        	entity.setName(doc.getName());
        	entity.setCompletedBy(doc.getCompletedBy());
        	entity.setCompletedDate(doc.getCompletedDate());
        	entity.setCompletedDescription(doc.getCompletedDescription());
        	entity.setApprovedBy(doc.getApprovedBy());
        	entity.setApprovedDate(doc.getApprovedDate());
        	entity.setApprovedDescription(doc.getApprovedDescription());
        	entity.setRegisteredNumber(doc.getRegisteredNumber());
        	entity.setRegisteredDate(doc.getRegisteredDate());
        	entity.setRegisteredDescription(doc.getRegisteredDescription());
        	entity.setRegisteredBy(doc.getRegisteredBy());
        	entity.setEntityDocumentState(doc.getEntityDocumentState());
        }
	}

	@Override
	public void deleteById(long id) {
		this.docDao.deleteById(id);
	}

	@Override
	public List<EntityDocument> findAll() {
		return this.docDao.findAll();
	}

}
