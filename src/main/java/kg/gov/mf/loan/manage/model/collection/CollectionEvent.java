package kg.gov.mf.loan.manage.model.collection;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="collection_event")
public class CollectionEvent {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="start_date", nullable=false)
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="close_date", nullable=false)
	private Date closeDate;
	
	@ManyToOne
	private CollectionPhase collectionPhase;
	
	@OneToOne
	@JoinColumn(name="event_status_id")
	private EventStatus eventStatus;
	
	@OneToOne
	@JoinColumn(name="event_type_id")
	private EventType eventType;
	
	public CollectionEvent()
	{
		
	}
	
	public CollectionEvent(Date startDate, Date closeDate, EventStatus eventStatus, EventType eventType) {
		this.startDate = startDate;
		this.closeDate = closeDate;
		this.eventStatus = eventStatus;
		this.eventType = eventType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public CollectionPhase getCollectionPhase() {
		return collectionPhase;
	}

	public void setCollectionPhase(CollectionPhase collectionPhase) {
		this.collectionPhase = collectionPhase;
	}

	public EventStatus getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
}
