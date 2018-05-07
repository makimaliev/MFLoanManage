package kg.gov.mf.loan.manage.service;

import java.util.List;

public interface GenericService<E> {

	void add(E entity);
    List<E> list();
    List<E> list(int firstResult, int maxResults);
    List<E> listByParam(String param);
    List<E> listByParam(String param, int firstResult, int maxResults);
    E getById(Long id);
    int count();
    void update(E entity);
    void remove(E entity);
    List<E> search(String searchText, List<String> onFields, String param, int firstResult, int maxResults);
    void indexEntity();
    int searchCount();
}
