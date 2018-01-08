package kg.gov.mf.loan.manage.service.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collection.CollectionDao;
import kg.gov.mf.loan.manage.model.collection.Collection;

@Service("collectionService")
@Transactional
public class CollectionServiceImpl implements CollectionService {
	
	@Autowired
	private CollectionDao dao;

	@Override
	public Collection findById(long id) {
		return this.dao.findById(id);
	}

	@Override
	public void save(Collection collection) {
		this.dao.save(collection);
	}

	@Override
	public void deleteById(long id) {
		this.dao.deleteById(id);
	}

	@Override
	public List<Collection> findAll() {
		return this.dao.findAll();
	}

}
