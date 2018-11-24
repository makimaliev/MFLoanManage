package kg.gov.mf.loan.manage.model.collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.task.model.GenericModel;

@Entity
@Table(name="collectionEvent")
public class CollectionEvent extends GenericModel {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date closeDate;
	
	@ManyToOne(targetEntity=CollectionPhase.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collectionPhaseId")
	CollectionPhase collectionPhase;
	
	@ManyToOne(targetEntity=EventStatus.class, fetch = FetchType.EAGER)
	@JoinColumn(name="eventStatusId")
	private EventStatus eventStatus;
	
	@ManyToOne(targetEntity=EventType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="eventTypeId")
	private EventType eventType;
	
	@OneToMany(mappedBy = "collectionEvent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<EventDetails> eventDetails = new HashSet<>();

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

	public Set<EventDetails> getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(Set<EventDetails> eventDetails) {
		this.eventDetails = eventDetails;
	}
}
