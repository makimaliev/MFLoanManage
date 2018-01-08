package kg.gov.mf.loan.manage.model.collection;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="collection_phase")
public class CollectionPhase {

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
	
	@Column(name="last_event")
	private long lastEvent;
	
	@Column(name="last_status_id")
	private long lastStatusId;
	
	@ManyToOne
	private CollectionProcedure collectionProcedure;
	
	@OneToOne
	@JoinColumn(name="phase_status_id")
	private PhaseStatus phaseStatus;
	
	@OneToOne
	@JoinColumn(name="phase_type_id")
	private PhaseType phaseType;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collectionPhase_id")
	private Set<CollectionEvent> collectionEvent;

	public CollectionPhase()
	{
		
	}
	
	public CollectionPhase(Date startDate, Date closeDate, long lastEvent, long lastStatusId, PhaseStatus phaseStatus,
			PhaseType phaseType) {
		this.startDate = startDate;
		this.closeDate = closeDate;
		this.lastEvent = lastEvent;
		this.lastStatusId = lastStatusId;
		this.phaseStatus = phaseStatus;
		this.phaseType = phaseType;
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

	public long getLastEvent() {
		return lastEvent;
	}

	public void setLastEvent(long lastEvent) {
		this.lastEvent = lastEvent;
	}

	public long getLastStatusId() {
		return lastStatusId;
	}

	public void setLastStatusId(long lastStatusId) {
		this.lastStatusId = lastStatusId;
	}

	public CollectionProcedure getCollectionProcedure() {
		return collectionProcedure;
	}

	public void setCollectionProcedure(CollectionProcedure collectionProcedure) {
		this.collectionProcedure = collectionProcedure;
	}

	public PhaseStatus getPhaseStatus() {
		return phaseStatus;
	}

	public void setPhaseStatus(PhaseStatus phaseStatus) {
		this.phaseStatus = phaseStatus;
	}

	public PhaseType getPhaseType() {
		return phaseType;
	}

	public void setPhaseType(PhaseType phaseType) {
		this.phaseType = phaseType;
	}

	public Set<CollectionEvent> getCollectionEvent() {
		return collectionEvent;
	}

	public void setCollectionEvent(Set<CollectionEvent> collectionEvent) {
		this.collectionEvent = collectionEvent;
	}
	
}
