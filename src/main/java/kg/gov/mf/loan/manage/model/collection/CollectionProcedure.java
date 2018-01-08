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
@Table(name="collection_procedure")
public class CollectionProcedure {

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
	
	@Column(name="last_phase")
	private long lastPhase;
	
	@Column(name="last_status_id")
	private long lastStatusId;
	
	@OneToOne
	@JoinColumn(name="procedure_status_id")
	private ProcedureStatus procedureStatus;
	
	@OneToOne
	@JoinColumn(name="procedure_type_id")
	private ProcedureType procedureType;
	
	@ManyToOne
	private Collection collection;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collectionProcedure_id")
	private Set<CollectionPhase> collectionPhase;
	
	public CollectionProcedure()
	{
		
	}
	
	public CollectionProcedure(Date startDate, Date closeDate, long lastPhase, long lastStatusId, ProcedureStatus procedureStatus,
			ProcedureType procedureType) {
		this.startDate = startDate;
		this.closeDate = closeDate;
		this.lastPhase = lastPhase;
		this.lastStatusId = lastStatusId;
		this.procedureStatus = procedureStatus;
		this.procedureType = procedureType;
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

	public long getLastPhase() {
		return lastPhase;
	}

	public void setLastPhase(long lastPhase) {
		this.lastPhase = lastPhase;
	}

	public long getLastStatusId() {
		return lastStatusId;
	}

	public void setLastStatusId(long lastStatusId) {
		this.lastStatusId = lastStatusId;
	}

	public ProcedureStatus getProcedureStatus() {
		return procedureStatus;
	}

	public void setProcedureStatus(ProcedureStatus procedureStatus) {
		this.procedureStatus = procedureStatus;
	}

	public ProcedureType getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(ProcedureType procedureType) {
		this.procedureType = procedureType;
	}

	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
	}

	public Set<CollectionPhase> getCollectionPhase() {
		return collectionPhase;
	}

	public void setCollectionPhase(Set<CollectionPhase> collectionPhase) {
		this.collectionPhase = collectionPhase;
	}
	
}
