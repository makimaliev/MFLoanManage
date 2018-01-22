package kg.gov.mf.loan.manage.dao.collection;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.EventDetails;

@Repository("eventDetailsDao")
public class EventDetailsDaoImpl extends GenericDaoImpl<EventDetails> implements EventDetailsDao{
}
