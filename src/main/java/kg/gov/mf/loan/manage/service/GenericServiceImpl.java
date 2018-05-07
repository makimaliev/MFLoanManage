package kg.gov.mf.loan.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.GenericDao;

import java.util.List;

@Service
public abstract class GenericServiceImpl<E> implements GenericService<E> {
	
	@Autowired
    protected GenericDao<E> dao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void add(E entity) {
	    dao.add(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> list() {
    	return dao.list();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> list(int firstResult, int maxResults) {
        return dao.list(firstResult ,maxResults);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> listByParam(String param) {
        return dao.listByParam(param);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> listByParam(String param, int firstResult, int maxResults) {
        return dao.listByParam(param, firstResult, maxResults);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public int count() {
        return dao.count();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public E getById(Long id) {
    	return dao.getById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E entity) {
    	dao.update(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E entity) {
    	dao.remove(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> search(String searchText, List<String> onFields, String param, int firstResult, int maxResults) {
        return dao.search(searchText, onFields, param, firstResult, maxResults);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public void indexEntity()
    {
        this.dao.indexEntity();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public int searchCount()
    {
       return this.dao.searchCount();
    }
}
