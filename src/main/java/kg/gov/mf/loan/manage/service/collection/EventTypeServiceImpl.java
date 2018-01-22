package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.EventType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("eventTypeService")
@Transactional
public class EventTypeServiceImpl extends GenericServiceImpl<EventType> implements EventTypeService{
}
