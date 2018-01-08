package kg.gov.mf.loan.manage.service.entitydocument;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entitydocument.EntityDocumentRegisteredByDao;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocumentRegisteredBy;

@Service("entityDocumentRegisteredByService")
@Transactional
public class EntityDocumentRegisteredByServiceImpl implements EntityDocumentRegisteredByService{
	
	@Autowired
	private EntityDocumentRegisteredByDao rbDao;

	@Override
	public EntityDocumentRegisteredBy findById(long id) {
		return this.rbDao.findById(id);
	}

	@Override
	public EntityDocumentRegisteredBy findByName(String name) {
		return this.rbDao.findByName(name);
	}

	@Override
	public void save(EntityDocumentRegisteredBy rb) {
		this.rbDao.save(rb);
	}

	@Override
	public void update(EntityDocumentRegisteredBy rb) {
		EntityDocumentRegisteredBy entity = this.rbDao.findById(rb.getId());
        if(entity!=null){
            entity.setName(rb.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.rbDao.deleteById(id);
	}

	@Override
	public List<EntityDocumentRegisteredBy> findAll() {
		return this.rbDao.findAll();
	}

	@Override
	public boolean isRBNameUnique(long id, String name) {
		EntityDocumentRegisteredBy rb = findByName(name);
        return (rb == null || ((id != 0L) && (rb.getId() == id)));
	}

}
