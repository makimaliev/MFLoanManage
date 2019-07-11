package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="collectionEvent")
public class CollectionEvent extends GenericModel {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
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

	private String docNumber;
	private String name;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(precision = 12, scale = 5)
	private Double sum=0.0;

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

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
