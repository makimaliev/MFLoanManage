package kg.gov.mf.loan.manage.dao;

//import org.apache.commons.lang3.StringUtils;
//import org.apache.lucene.search.Sort;
//import org.apache.lucene.search.SortField;
import org.hibernate.Criteria;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
//import org.hibernate.search.FullTextSession;
//import org.hibernate.search.Search;
//import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

@Repository
public abstract class GenericDaoImpl<E> implements GenericDao<E> {
	
	@Autowired
    protected SessionFactory sessionFactory;
    protected Class<? extends E> entityClass;

    public int searchCount;

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        entityClass = (Class) pt.getActualTypeArguments()[0];
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void add(E entity) {
        getCurrentSession().save(entity);
    }

    public List<E> list() {
        return getCurrentSession().createCriteria(entityClass).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
    }

    public List<E> list(int firstResult, int maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    public List<E> listByParam(String param) {
        return getCurrentSession().createCriteria(entityClass).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).addOrder(Order.asc(param)).list();
    }

    public List<E> listByParam(String param, int firstResult, int maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.addOrder(Order.asc(param));
        return criteria.list();
    }

    public int count()
    {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        ScrollableResults scrollableResults = criteria.scroll();
        scrollableResults.last();
        return  scrollableResults.getRowNumber()+1;
    }

    public E getById(Long id) {
        return (E) getCurrentSession().get(entityClass, id);
    }

    public void update(E entity) {
        getCurrentSession().update(entity);
    }

    public void remove(E entity) {
        getCurrentSession().delete(entity);
    }

    /*
    public List<E> search(String searchText, List<String> onFields, String param, int firstResult, int maxResults)
    {
        FullTextSession fullTextSession = Search.getFullTextSession(getCurrentSession());

        QueryBuilder qb = fullTextSession.getSearchFactory()
                .buildQueryBuilder().forEntity(entityClass).get();

        org.apache.lucene.search.Query query = qb
                .keyword()
                .fuzzy()
                .withEditDistanceUpTo(2)
                .withPrefixLength(0)
                .onFields(StringUtils.join(onFields, ','))
                .matching(searchText)
                .createQuery();

        Sort sort = new Sort( new SortField( param, SortField.Type.STRING, false ) );

        org.hibernate.search.FullTextQuery hibQuery = fullTextSession.createFullTextQuery(query, entityClass)
                .setFirstResult(firstResult)
                .setMaxResults(maxResults)
                .setSort(sort);

        this.searchCount = hibQuery.getResultSize();

        List<E> results = hibQuery.list();

        return results;
    }

    public void indexEntity()
    {
        try
        {
            FullTextSession fullTextSession = Search.getFullTextSession(getCurrentSession());
            fullTextSession.createIndexer().startAndWait();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public int searchCount()
    {
        return this.searchCount;
    }
    */

}
