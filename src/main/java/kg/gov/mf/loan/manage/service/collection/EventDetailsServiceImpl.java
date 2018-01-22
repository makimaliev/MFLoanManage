package kg.gov.mf.loan.manage.service.collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collection.EventDetails;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("eventDetailsService")
@Transactional
public class EventDetailsServiceImpl extends GenericServiceImpl<EventDetails> implements EventDetailsService{
}
