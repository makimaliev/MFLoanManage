package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.EventStatus;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("eventStatusService")
@Transactional
public class EventStatusServiceImpl extends GenericServiceImpl<EventStatus> implements EventStatusService{
}
