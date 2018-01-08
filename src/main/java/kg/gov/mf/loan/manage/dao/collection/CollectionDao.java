package kg.gov.mf.loan.manage.dao.collection;

import java.util.List;

import kg.gov.mf.loan.manage.model.collection.Collection;

public interface CollectionDao {

	List<Collection> findAll();
	Collection findById(long id);
    void save(Collection collection);
    void deleteById(long id);
	
}
