package kg.gov.mf.loan.manage.service;

import kg.gov.mf.loan.manage.dao.GenericDao;
import kg.gov.mf.loan.task.component.AuthenticationFacade;
import kg.gov.mf.loan.task.component.AutowireHelper;
import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.task.model.LogAction;
import kg.gov.mf.loan.task.model.MFLog;
import kg.gov.mf.loan.task.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public abstract class GenericServiceImpl<E> implements GenericService<E> {

    @Autowired
    protected GenericDao<E> dao;

    @Autowired
    private LoggerService loggerService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void add(E entity) {
        Long id = dao.add(entity);
        addLog(dao.getById(id), LogAction.INSERTED);
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
        addLog(entity, LogAction.UPDATED);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E entity) {
        dao.remove(entity);
        addLog(entity, LogAction.DELETED);
    }

    /*
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
    */

    private void addLog(Object o, LogAction logAction)
    {
        AutowireHelper.autowire(this, this.loggerService);
        AutowireHelper.autowire(this, this.authenticationFacade);

        Authentication auth = authenticationFacade.getAuthentication();
        String user = "System";
        String ip = "localhost";

        if(auth.isAuthenticated())
        {
            user = ((UserDetails) auth.getPrincipal()).getUsername();
            ip = ((WebAuthenticationDetails)auth.getDetails()).getRemoteAddress();
        }

        MFLog log = new MFLog();
        log.setCreatedBy(user);
        log.setIp(ip);
        log.setEntity(o.getClass().getSimpleName());
        log.setEntityId(((GenericModel)o).getId());
        log.setAction(logAction.value());
        loggerService.add(log);
    }
}
